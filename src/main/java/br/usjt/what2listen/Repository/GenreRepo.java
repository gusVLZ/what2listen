package br.usjt.what2listen.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.usjt.what2listen.Model.Genre;

	@Repository
	public interface GenreRepo extends CrudRepository<Genre, Integer> {

	@Query(value="select g.* from user_x_genre ug left join genre g on ug.id_genre = g.id where id_user = ?1", nativeQuery=true)
	List<Genre> getFavGenres(int idUser);
}
