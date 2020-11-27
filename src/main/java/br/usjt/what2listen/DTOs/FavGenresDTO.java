package br.usjt.what2listen.DTOs;

import lombok.Value;

@Value
public class FavGenresDTO {
    Integer idGenre;
    String name;
    Integer percentual;
}
