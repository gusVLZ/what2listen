package br.usjt.what2listen.Model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.*;


@Entity
@Table(name="user_table")
public class UserTable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String username;
	private String email;
	private String password;
	private boolean active = true;
	private Date created_at = new Date();
	private Date updated_at = new Date();

	public UserTable() {
	}

	public UserTable(Integer id, String username, String email, String password) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public UserTable(Integer id, String username, String email, String password, boolean active, Date created_at, Date updated_at) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.active = active;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return this.active;
	}

	public boolean getActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getCreated_at() {
		return this.created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return this.updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public UserTable id(Integer id) {
		this.id = id;
		return this;
	}

	public UserTable username(String username) {
		this.username = username;
		return this;
	}

	public UserTable email(String email) {
		this.email = email;
		return this;
	}

	public UserTable password(String password) {
		this.password = password;
		return this;
	}

	public UserTable active(boolean active) {
		this.active = active;
		return this;
	}

	public UserTable created_at(Date created_at) {
		this.created_at = created_at;
		return this;
	}

	public UserTable updated_at(Date updated_at) {
		this.updated_at = updated_at;
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof UserTable)) {
			return false;
		}
		UserTable user = (UserTable) o;
		return Objects.equals(id, user.id) && Objects.equals(username, user.username) && Objects.equals(email, user.email) && Objects.equals(password, user.password) && active == user.active && Objects.equals(created_at, user.created_at) && Objects.equals(updated_at, user.updated_at);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, username, email, password, active, created_at, updated_at);
	}

	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", username='" + getUsername() + "'" +
			", email='" + getEmail() + "'" +
			", password='" + getPassword() + "'" +
			", active='" + isActive() + "'" +
			", created_at='" + getCreated_at() + "'" +
			", updated_at='" + getUpdated_at() + "'" +
			"}";
	}

}
