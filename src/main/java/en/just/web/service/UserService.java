package en.just.web.service;

import en.just.api.dto.UserDTO;
import en.just.api.dto.mapper.GenericMapper;
import en.just.dao.entity.User;
import en.just.dao.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private GenericMapper<User, UserDTO> userMapper;

	public User create(UserDTO userDTO) {
		User user = userMapper.fromDto(userDTO);
		LOGGER.info("creating User: " + user);
		return userRepository.save(user);
	}

}