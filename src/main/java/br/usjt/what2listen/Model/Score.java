package br.usjt.what2listen.Model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.*;

@Entity
public class Score {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String id_user;
	private String id_sxg;
	private String intensity;
	private Date created_at = new Date();
	private Date updated_at = new Date();
	private boolean active = true;

	public Score() {
	}

	public Score(Integer id, String id_user, String id_sxg, String intensity, Date created_at, Date updated_at, boolean active) {
		this.id = id;
		this.id_user = id_user;
		this.id_sxg = id_sxg;
		this.intensity = intensity;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.active = active;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getId_user() {
		return this.id_user;
	}

	public void setId_user(String id_user) {
		this.id_user = id_user;
	}

	public String getId_sxg() {
		return this.id_sxg;
	}

	public void setId_sxg(String id_sxg) {
		this.id_sxg = id_sxg;
	}

	public String getIntensity() {
		return this.intensity;
	}

	public void setIntensity(String intensity) {
		this.intensity = intensity;
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

	public boolean isActive() {
		return this.active;
	}

	public boolean getActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Score id(Integer id) {
		this.id = id;
		return this;
	}

	public Score id_user(String id_user) {
		this.id_user = id_user;
		return this;
	}

	public Score id_sxg(String id_sxg) {
		this.id_sxg = id_sxg;
		return this;
	}

	public Score intensity(String intensity) {
		this.intensity = intensity;
		return this;
	}

	public Score created_at(Date created_at) {
		this.created_at = created_at;
		return this;
	}

	public Score updated_at(Date updated_at) {
		this.updated_at = updated_at;
		return this;
	}

	public Score active(boolean active) {
		this.active = active;
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Score)) {
			return false;
		}
		Score score = (Score) o;
		return Objects.equals(id, score.id) && Objects.equals(id_user, score.id_user) && Objects.equals(id_sxg, score.id_sxg) && Objects.equals(intensity, score.intensity) && Objects.equals(created_at, score.created_at) && Objects.equals(updated_at, score.updated_at) && active == score.active;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, id_user, id_sxg, intensity, created_at, updated_at, active);
	}

	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", id_user='" + getId_user() + "'" +
			", id_sxg='" + getId_sxg() + "'" +
			", intensity='" + getIntensity() + "'" +
			", created_at='" + getCreated_at() + "'" +
			", updated_at='" + getUpdated_at() + "'" +
			", active='" + isActive() + "'" +
			"}";
	}
	

}
