package br.usjt.what2listen.Model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.*;

@Entity
public class Song {
    @Id
	private Integer id;
	private String name;
	private Date created_at;
	private Date updated_at;
	private boolean active = true;

    public Song() {
    }

    public Song(int id, String name, Date created_at, Date updated_at, boolean active) {
        this.id = id;
        this.name = name;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.active = active;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Song id(int id) {
        this.id = id;
        return this;
    }

    public Song name(String name) {
        this.name = name;
        return this;
    }

    public Song created_at(Date created_at) {
        this.created_at = created_at;
        return this;
    }

    public Song updated_at(Date updated_at) {
        this.updated_at = updated_at;
        return this;
    }

    public Song active(boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Song)) {
            return false;
        }
        Song song = (Song) o;
        return id == song.id && Objects.equals(name, song.name) && Objects.equals(created_at, song.created_at) && Objects.equals(updated_at, song.updated_at) && active == song.active;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, created_at, updated_at, active);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", created_at='" + getCreated_at() + "'" +
            ", updated_at='" + getUpdated_at() + "'" +
            ", active='" + isActive() + "'" +
            "}";
    }
}
