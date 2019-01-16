package en.just.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import en.just.entity.Booking;
import en.just.entity.Room;
import en.just.entity.User;

public interface BookingRepository extends JpaRepository<Booking, Long> {
	
	

    Boolean existsByRoomAndDateToGreaterThanEqualAndDateFromLessThanEqual(Room room, LocalDateTime dateFrom, LocalDateTime dateTo);

    List<Booking> findAllByDateFromGreaterThanEqualAndDateToLessThanEqual(LocalDateTime dateFrom, LocalDateTime dateTo);
    List<Booking> findAllByDateFromGreaterThanEqual(LocalDateTime dateFrom);
    List<Booking> findAllByDateToLessThanEqual(LocalDateTime dateTo);

    List<Booking> findAllByRoom(Room room);
    List<Booking> findAllByRoomAndDateFromGreaterThanEqualAndDateToLessThanEqual(Room room, LocalDateTime dateFrom, LocalDateTime dateTo);
    List<Booking> findAllByRoomAndDateFromGreaterThanEqual(Room room, LocalDateTime dateFrom);
    List<Booking> findAllByRoomAndDateToLessThanEqual(Room room, LocalDateTime dateTo);

    List<Booking> findAllByUser(User user);
    List<Booking> findAllByUserAndDateFromGreaterThanEqualAndDateToLessThanEqual(User user, LocalDateTime dateFrom, LocalDateTime dateTo);
    List<Booking> findAllByUserAndDateFromGreaterThanEqual(User user, LocalDateTime dateFrom);
    List<Booking> findAllByUserAndDateToLessThanEqual(User user, LocalDateTime dateTo);


}

