package br.usjt.what2listen.Repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.usjt.what2listen.Model.UserGenre;

@Repository
public interface UserGenreRepo extends CrudRepository<UserGenre, Integer> {
    @Query(value="select * from user_x_genre where id_user = ?1 and id_genre = ?2 and active=1 limit 1", nativeQuery = true)
    UserGenre getUserGenreByGenreId(int idUser, int idGenre);
    @Query(value="select * from user_x_genre where id_user = ?1 and id_genre = ?2 and active=1 limit 1", nativeQuery = true)
    UserGenre getGenreById(int idUser, int idGenre);
}
