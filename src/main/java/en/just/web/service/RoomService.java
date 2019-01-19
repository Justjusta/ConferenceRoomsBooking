package en.just.web.service;

import en.just.api.dto.RoomDTO;
import en.just.api.dto.mapper.GenericMapper;
import en.just.dao.entity.Room;
import en.just.dao.repository.RoomRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor
public class RoomService {

	private static final Logger LOGGER = LoggerFactory.getLogger(RoomService.class);

	@Autowired
	private RoomRepository roomRepository;

	@Autowired
	private GenericMapper<Room, RoomDTO> roomMapper;

	public Room create(RoomDTO roomDTO) {
		Room room = roomMapper.fromDto(roomDTO);
		LOGGER.info("creating Room: " + room);
		return roomRepository.save(room);
	}

	public Room edit(String name, RoomDTO roomDTO) {
		Room foundRoom = roomRepository.findByName(name);
		if ((roomDTO.getName() != null)) {
			foundRoom.setName(roomDTO.getName());
		}
		if ((roomDTO.getLocation() != null)) {
			foundRoom.setLocation(roomDTO.getLocation());
		}
		if ((roomDTO.getPhone() != null)) {
			foundRoom.setPhone(roomDTO.getPhone());
		}

		LOGGER.info("editing Room: " + foundRoom);
		return roomRepository.save(foundRoom);
	}
}