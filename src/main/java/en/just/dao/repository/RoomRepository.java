package en.just.dao.repository;

import en.just.dao.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {

    Room findByName(String name);

}
