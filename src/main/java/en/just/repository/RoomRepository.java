package en.just.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import en.just.entity.Room;
import en.just.entity.User;

public interface RoomRepository extends JpaRepository<Room, Long> {

	User findByName(String name);

	Boolean existsByName(String name);

}
