package en.just.api.dto.mapper;

import en.just.api.dto.RoomDTO;
import en.just.dao.entity.Room;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class RoomMapper implements GenericMapper<Room, RoomDTO> {
    @Override
    public RoomDTO fromModel(Room input) {
        RoomDTO roomDTO = new RoomDTO();
        BeanUtils.copyProperties(input, roomDTO);
        return roomDTO;
    }

    @Override
    public Room fromDto(RoomDTO output) {
        Room room = new Room();
        BeanUtils.copyProperties(output, room);
        return room;
    }
}
