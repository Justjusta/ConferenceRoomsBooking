package en.just.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {

	private static final String USERS_ID_SEQ = "USERS_ID_SEQ";
	private static final String USERS_ID_GENERATOR = "USERS_ID_GENERATOR";

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = USERS_ID_GENERATOR)
	@SequenceGenerator(name = USERS_ID_GENERATOR, sequenceName = USERS_ID_SEQ)
	private Long id;

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

	public User() {
	}

	public User(@NotNull @Size(max = 50) String name, @NotNull @Size(max = 100) String surname, @NotNull String login, @NotNull @Size(max = 100, min = 6) String password) {
		this.name = name;
		this.surname = surname;
		this.login = login;
		this.password = password;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return Objects.equals(id, user.id) &&
				Objects.equals(name, user.name) &&
				Objects.equals(surname, user.surname) &&
				Objects.equals(login, user.login) &&
				Objects.equals(password, user.password);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, surname, login, password);
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("User{");
		sb.append("id=").append(id);
		sb.append(", name='").append(name).append('\'');
		sb.append(", surname='").append(surname).append('\'');
		sb.append(", login='").append(login).append('\'');
		sb.append(", password='").append(password).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
