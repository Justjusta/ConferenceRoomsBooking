package en.just.api.dto;

import java.time.LocalDateTime;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import en.just.entity.Room;
import en.just.entity.User;

public class BookingDTO {

	@ManyToOne
	@JoinColumn(name = "userLogin")
	private User user;

	@ManyToOne
	@JoinColumn(name = "roomName")
	private Room room;

	@NotNull
	private LocalDateTime dateFrom;

	@NotNull
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
