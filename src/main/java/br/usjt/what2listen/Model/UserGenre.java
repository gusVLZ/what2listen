package br.usjt.what2listen.Model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_x_genre")
public class UserGenre {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer id_user;
    private Integer id_genre;
	private boolean active = true;
	private Date created_at = new Date();
	private Date updated_at = new Date();

    public UserGenre() {
    }

    public UserGenre(Integer id, Integer id_user, Integer id_genre) {
        this.id = id;
        this.id_user = id_user;
        this.id_genre = id_genre;
    }

    public UserGenre(Integer id, Integer id_user, Integer id_genre, boolean active, Date created_at, Date updated_at) {
        this.id = id;
        this.id_user = id_user;
        this.id_genre = id_genre;
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

    public Integer getId_user() {
        return this.id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public Integer getId_genre() {
        return this.id_genre;
    }

    public void setId_genre(Integer id_genre) {
        this.id_genre = id_genre;
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

    public UserGenre id(Integer id) {
        this.id = id;
        return this;
    }

    public UserGenre id_user(Integer id_user) {
        this.id_user = id_user;
        return this;
    }

    public UserGenre id_genre(Integer id_genre) {
        this.id_genre = id_genre;
        return this;
    }

    public UserGenre active(boolean active) {
        this.active = active;
        return this;
    }

    public UserGenre created_at(Date created_at) {
        this.created_at = created_at;
        return this;
    }

    public UserGenre updated_at(Date updated_at) {
        this.updated_at = updated_at;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UserGenre)) {
            return false;
        }
        UserGenre userGenre = (UserGenre) o;
        return Objects.equals(id, userGenre.id) && Objects.equals(id_user, userGenre.id_user) && Objects.equals(id_genre, userGenre.id_genre) && active == userGenre.active && Objects.equals(created_at, userGenre.created_at) && Objects.equals(updated_at, userGenre.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, id_user, id_genre, active, created_at, updated_at);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", id_user='" + getId_user() + "'" +
            ", id_genre='" + getId_genre() + "'" +
            ", active='" + isActive() + "'" +
            ", created_at='" + getCreated_at() + "'" +
            ", updated_at='" + getUpdated_at() + "'" +
            "}";
    }
}
