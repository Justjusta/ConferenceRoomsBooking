package en.just.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
public class Booking {

	private static final String BOOKINGS_ID_SEQ = "BOOKINGS_ID_SEQ";
	private static final String BOOKINGS_ID_GENERATOR = "BOOKINGS_ID_GENERATOR";

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = BOOKINGS_ID_GENERATOR)
	@SequenceGenerator(name = BOOKINGS_ID_GENERATOR, sequenceName = BOOKINGS_ID_SEQ)
	private Long id;

//	@ManyToOne
//	@JoinColumn(name = "userLogin")
//	private User user;

//	@ManyToOne
//	@JoinColumn(name = "roomName")
//	private Room room;

	@NotNull
	private LocalDateTime dateFrom;

	@NotNull
	private LocalDateTime dateTo;

	public Booking() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//	public Room getRoom() {
//		return room;
//	}
//
//	public void setRoom(Room room) {
//		this.room = room;
//	}

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
