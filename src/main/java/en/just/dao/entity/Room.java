package en.just.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "rooms")
public class Room {

	private static final String ROOMS_ID_SEQ = "ROOMS_ID_SEQ";
	private static final String ROOMS_ID_GENERATOR = "ROOMS_ID_GENERATOR";

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ROOMS_ID_GENERATOR)
	@SequenceGenerator(name = ROOMS_ID_GENERATOR, sequenceName = ROOMS_ID_SEQ)
	private Long id;

	@Column(name = "roomName", unique = true)
	@NotNull
	@Size(max = 50)
	private String name;

	@Size(max = 256)
	private String location;

	@Max(value = 100)
	@Min(value = 0)
	private int seats;

	@Column(columnDefinition = "boolean default false")
	private boolean projector;

	@Size(max = 100)
	private String phone;

	public Room() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public boolean isProjector() {
		return projector;
	}

	public void setProjector(boolean projector) {
		this.projector = projector;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
