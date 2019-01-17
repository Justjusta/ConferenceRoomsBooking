package en.just.web.controller;

import en.just.api.dto.RoomDTO;
import en.just.dao.entity.Room;
import en.just.web.service.RoomService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rooms")
//@RequiredArgsConstructor
public class RoomController {

	private static final Logger LOGGER = LoggerFactory.getLogger(RoomController.class);

	@Autowired
	private RoomService roomService;

	@PostMapping
	public Room create(@RequestBody RoomDTO roomDTO) {
		LOGGER.info("creating Room: " + roomDTO);
		return roomService.create(roomDTO);
	}



	/*
	 * @PutMapping("/edit")
	 * 
	 * @GetMapping("/available")
	 * 
	 * @DeleteMapping("/delete")
	 */
}