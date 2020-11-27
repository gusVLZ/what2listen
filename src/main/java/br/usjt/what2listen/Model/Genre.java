package br.usjt.what2listen.Model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Genre {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    Date created_at;
    Date updated_at;
    boolean active;

    public Genre() {
    }

    public Genre(Integer id, String name, Date created_at, Date updated_at, boolean active) {
        this.id = id;
        this.name = name;
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

    public Genre id(Integer id) {
        this.id = id;
        return this;
    }

    public Genre name(String name) {
        this.name = name;
        return this;
    }

    public Genre created_at(Date created_at) {
        this.created_at = created_at;
        return this;
    }

    public Genre updated_at(Date updated_at) {
        this.updated_at = updated_at;
        return this;
    }

    public Genre active(boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Genre)) {
            return false;
        }
        Genre genre = (Genre) o;
        return Objects.equals(id, genre.id) && Objects.equals(name, genre.name) && Objects.equals(created_at, genre.created_at) && Objects.equals(updated_at, genre.updated_at) && active == genre.active;
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
