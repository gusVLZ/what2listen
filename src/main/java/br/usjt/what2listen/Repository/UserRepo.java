package br.usjt.what2listen.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.usjt.what2listen.Model.UserTable;

	@Repository
	public interface UserRepo extends CrudRepository<UserTable, Integer> {

		@Query(value="select * from user_table where username = ?1 and password = ?2 and active = 1 ", nativeQuery=true)
		UserTable login(String username, String pass);
}
