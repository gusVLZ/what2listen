package br.usjt.what2listen.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.usjt.what2listen.Model.Song_x_Genre;

	@Repository
	public interface Song_x_GenreRepo extends CrudRepository<Song_x_Genre, Integer> {
}
