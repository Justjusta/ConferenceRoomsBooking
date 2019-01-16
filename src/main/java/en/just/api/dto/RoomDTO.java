package en.just.api.dto;

import javax.persistence.Column;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RoomDTO {

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

	public RoomDTO() {
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
