package br.usjt.what2listen.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.usjt.what2listen.Model.UserGenre;

@Repository
public interface UserGenreRepo extends CrudRepository<UserGenre, Integer> {
	
}
