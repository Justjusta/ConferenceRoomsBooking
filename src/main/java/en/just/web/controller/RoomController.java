package en.just.web.controller;

import en.just.web.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rooms")
//@RequiredArgsConstructor
public class RoomController {

	@Autowired
	private RoomService roomService;

	@PostMapping
	public String create() {
		roomService.create();
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