package en.just.web.service;

import en.just.api.dto.UserDTO;
import en.just.api.dto.mapper.GenericMapper;
import en.just.dao.entity.User;
import en.just.dao.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private GenericMapper<User, UserDTO> userMapper;

	public UserDTO create(UserDTO userDTO) {
		User user = userMapper.fromDto(userDTO);
		LOGGER.info("creating User: " + user);
		User createdUser = userRepository.save(user);

		return userMapper.fromModel(createdUser);
	}


    public User edit(String login, UserDTO userDTO) {
        User foundUser = userRepository.findByLogin(login);
        if ((userDTO.getName() != null)) {
            foundUser.setName(userDTO.getName());
        }
        if ((userDTO.getSurname() != null)) {
            foundUser.setSurname(userDTO.getSurname());
        }
        if ((userDTO.getPassword() != null)) {
            foundUser.setPassword(hashPassword(foundUser.getPassword()));
        }

        LOGGER.info("editing User: " + foundUser);
        return userRepository.save(foundUser);
    }


    private String hashPassword(String password) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-256");
            md.update(password.getBytes());
            byte[] digest = md.digest();

            return String.format("%064x", new BigInteger(1, digest));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}