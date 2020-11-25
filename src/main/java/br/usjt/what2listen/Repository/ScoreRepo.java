package br.usjt.what2listen.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.usjt.what2listen.Model.Score;

	@Repository
	public interface ScoreRepo extends CrudRepository<Score, Integer> {

	@Query(value="select count(id) from song_x_genre where id_song = ?1", nativeQuery = true)
	int getNumberOfGenres(int idSong);
}
