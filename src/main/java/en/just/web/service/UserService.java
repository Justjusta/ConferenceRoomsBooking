package en.just.web.service;

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

	public User create() {
		LOGGER.info("creating User");
		return userRepository.save(new User("Just", "Łuni", "jluni", "0987654321"));
	}

}