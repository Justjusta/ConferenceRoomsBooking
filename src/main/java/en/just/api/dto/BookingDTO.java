package en.just.api.dto;

import en.just.dao.entity.Room;
import en.just.dao.entity.User;

import java.time.LocalDateTime;

public class BookingDTO {

	private User user;

	private Room room;

	private LocalDateTime dateFrom;

	private LocalDateTime dateTo;

	public BookingDTO() {
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public LocalDateTime getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(LocalDateTime dateFrom) {
		this.dateFrom = dateFrom;
	}

	public LocalDateTime getDateTo() {
		return dateTo;
	}

	public void setDateTo(LocalDateTime dateTo) {
		this.dateTo = dateTo;
	}

}
