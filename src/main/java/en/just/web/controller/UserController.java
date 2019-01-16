package en.just.web.controller;

import en.just.dao.entity.User;
import en.just.web.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@PostMapping
	public User create() {
		LOGGER.info("creating User");
        return userService.create();
	}

	/*
	 * @PutMapping("/edit")
	 * 
	 * @GetMapping("/available")
	 * 
	 * @DeleteMapping("/delete")
	 */

}
