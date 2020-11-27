package br.usjt.what2listen.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.usjt.what2listen.DTOs.FavGenresDTO;
import br.usjt.what2listen.Model.User;

	@Repository
	public interface UserRepo extends CrudRepository<User, Integer> {

	@Query(value="")
	List<FavGenresDTO> getFavGenres(int idUser);
}
