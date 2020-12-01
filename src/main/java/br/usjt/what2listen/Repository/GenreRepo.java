package br.usjt.what2listen.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.usjt.what2listen.Model.Genre;

	@Repository
	public interface GenreRepo extends CrudRepository<Genre, Integer> {

	@Query(value="select g.* from user_x_genre ug left join genre g on ug.id_genre = g.id where id_user = ?1 and ug.active=1", nativeQuery=true)
	List<Genre> getFavGenres(int idUser);

	@Query(value="select gr.* from song_x_genre as uxg inner join Genre as gr on uxg.id_Genre = gr.id where uxg.id_Song = ?1 and uxg.active=1 and gr.active=1", nativeQuery = true)
    List<Genre> getGenreById(int idSong);
}
