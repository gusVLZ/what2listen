package br.usjt.what2listen.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.usjt.what2listen.Model.Genre;
import br.usjt.what2listen.Model.UserTable;

	@Repository
	public interface UserRepo extends CrudRepository<UserTable, Integer> {

		@Query(value="select g.* from user_x_genre ug left join genre g on ug.id_genre = g.id where id_user = ?1", nativeQuery=true)
		List<Genre> getFavGenres(int idUser);

		@Query(value="select * from user_table where username = ?1 and password = ?2 ", nativeQuery=true)
		UserTable login(String username, String pass);
}
