package en.just.api.dto;

public class RoomDTO {

	private String name;

	private String location;

	private int seats;

	private boolean projector;

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
