package en.just.api.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDTO {

	@NotNull
	@Size(max = 50)
	private String name;

	@NotNull
	@Size(max = 100)
	private String surname;

	@Column(unique = true, length = 100)
	@NotNull
	private String login;

	@NotNull
	@Size(max = 100, min = 6)
	private String password;

	public UserDTO() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
