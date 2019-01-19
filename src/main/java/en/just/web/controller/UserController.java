package en.just.web.controller;

import en.just.api.dto.UserDTO;
import en.just.dao.entity.User;
import en.just.web.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserDTO create(@RequestBody UserDTO userDTO) {
		LOGGER.info("creating User: " + userDTO);
        return userService.create(userDTO);
	}

    @PutMapping
    public User edit(@PathVariable String login, @RequestBody UserDTO userDTO) {
        LOGGER.info("editing User: {} with login: {}", userDTO, login);
        return userService.edit(login, userDTO);
    }

    /*
     * @DeleteMapping("/delete")
     */

}
