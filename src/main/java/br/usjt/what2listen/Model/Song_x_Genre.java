package br.usjt.what2listen.Model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Song_x_Genre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer id_song;
	private Integer id_genre;
	private boolean active = true;
	private Date created_at = new Date();
	private Date updated_at = new Date();

	
	public Song_x_Genre() {

	}

	public Song_x_Genre(Integer id, Integer id_song, Integer id_genre, boolean active, Date created_at,
			Date updated_at) {
		super();
		this.id = id;
		this.id_song = id_song;
		this.id_genre = id_genre;
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

	public Integer getId_song() {
		return id_song;
	}

	public void setId_song(Integer id_song) {
		this.id_song = id_song;
	}

	public Integer getId_genre() {
		return id_genre;
	}

	public void setId_genre(Integer id_genre) {
		this.id_genre = id_genre;
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
