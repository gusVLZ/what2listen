package br.usjt.what2listen.DTOs;

import java.util.Objects;

public class FavGenresDTO {
    private Integer idGenre;
    private Integer percentual;

    public FavGenresDTO() {
    }

    public FavGenresDTO(Integer idGenre, Integer percentual) {
        this.idGenre = idGenre;
        this.percentual = percentual;
    }

    public Integer getIdGenre() {
        return this.idGenre;
    }

    public void setIdGenre(Integer idGenre) {
        this.idGenre = idGenre;
    }

    public Integer getPercentual() {
        return this.percentual;
    }

    public void setPercentual(Integer percentual) {
        this.percentual = percentual;
    }

    public FavGenresDTO idGenre(Integer idGenre) {
        this.idGenre = idGenre;
        return this;
    }

    public FavGenresDTO percentual(Integer percentual) {
        this.percentual = percentual;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof FavGenresDTO)) {
            return false;
        }
        FavGenresDTO favGenresDTO = (FavGenresDTO) o;
        return Objects.equals(idGenre, favGenresDTO.idGenre) && Objects.equals(percentual, favGenresDTO.percentual);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGenre, percentual);
    }

    @Override
    public String toString() {
        return "{" +
            " idGenre='" + getIdGenre() + "'" +
            ", percentual='" + getPercentual() + "'" +
            "}";
    }

}
