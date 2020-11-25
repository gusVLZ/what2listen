package br.usjt.what2listen.DTOs;

import java.util.Objects;

public class ListenedDTO {
    private Integer idUser;
    private Integer idSong;
    

    public ListenedDTO() {
    }

    public ListenedDTO(Integer idUser, Integer idSong) {
        this.idUser = idUser;
        this.idSong = idSong;
    }

    public Integer getIdUser() {
        return this.idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdSong() {
        return this.idSong;
    }

    public void setIdSong(Integer idSong) {
        this.idSong = idSong;
    }

    public ListenedDTO idUser(Integer idUser) {
        this.idUser = idUser;
        return this;
    }

    public ListenedDTO idSong(Integer idSong) {
        this.idSong = idSong;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ListenedDTO)) {
            return false;
        }
        ListenedDTO listenedDTO = (ListenedDTO) o;
        return Objects.equals(idUser, listenedDTO.idUser) && Objects.equals(idSong, listenedDTO.idSong);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, idSong);
    }

    @Override
    public String toString() {
        return "{" +
            " idUser='" + getIdUser() + "'" +
            ", idSong='" + getIdSong() + "'" +
            "}";
    }

}
