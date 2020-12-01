package br.usjt.what2listen.Model;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="song_rate")
public class SongRate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer id_user;
	private Integer id_song;
	private Integer rate;
	private boolean active = true;
	private Date created_at = new Date();
	private Date updated_at = new Date();

	public SongRate() {

	}

	public SongRate(Integer id_user, Integer id_song, Integer rate) {
		super();
		this.id_user = id_user;
		this.id_song = id_song;
		this.rate = rate;
	}


	public SongRate(Integer id, Integer id_user, Integer id_song, Integer rate, boolean active, Date created_at, Date updated_at) {
		super();
		this.id = id;
		this.id_user = id_user;
		this.id_song = id_song;
		this.rate = rate;
		this.active = active;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_user() {
		return id_user;
	}

	public void setId_user(Integer id_user) {
		this.id_user = id_user;
	}

	public Integer getId_song() {
		return id_song;
	}

	public void setId_song(Integer id_song) {
		this.id_song = id_song;
	}

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	
}
