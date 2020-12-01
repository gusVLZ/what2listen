package br.usjt.what2listen.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.usjt.what2listen.Model.Genre;
import br.usjt.what2listen.Model.SongGenre;

@Repository
public interface SongGenreRepo extends CrudRepository<SongGenre, Integer> {

	@Query(value = "select * from song_x_genre where id_song = ?1", nativeQuery = true)
	List<SongGenre> getSongGenres(int idSong);
	
	
	
}
