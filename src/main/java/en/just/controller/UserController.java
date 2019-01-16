package en.just.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import en.just.service.UserService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping
	public String create() {
		userService.create();
		return null;
	}

	/*
	 * @PutMapping("/edit")
	 * 
	 * @GetMapping("/available")
	 * 
	 * @DeleteMapping("/delete")
	 */

}
