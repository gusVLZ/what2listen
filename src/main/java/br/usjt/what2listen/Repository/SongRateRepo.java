package br.usjt.what2listen.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.usjt.what2listen.Model.SongRate;

@Repository
public interface SongRateRepo extends CrudRepository<SongRate, Integer> {

	@Query(value = " SELECT sg.id AS songId, sg.name AS songName, sg.artist, AVG(sr.rate) AS 'rate' "+
	" FROM song AS sg "+
	" LEFT JOIN song_rate AS sr ON  "+
	" 			sg.id = sr.id_song "+
	" LEFT JOIN song_x_genre AS sxg ON  "+
	" 			sxg.id_song = sg.id "+
	" LEFT JOIN genre AS gr ON  "+
	" 			gr.id = sxg.id_genre "+
	" RIGHT JOIN user_x_genre AS uxg ON "+
	" 			uxg.id_genre = gr.id "+
	" 			AND uxg.active=1 "+
	" WHERE uxg.id_user = 1 AND sg.id NOT IN ( "+
	" SELECT id_song "+
	" FROM song_rate "+
	" WHERE id_user = ?1 "+
	" GROUP BY id_song) "+
	" GROUP BY sg.id, sg.name, sg.artist "+
	" ORDER BY AVG(sr.rate) DESC "+
	" LIMIT 10 ", nativeQuery = true)
	String[][] getRecomendedSongs(int idUser); 

	@Query(value = "select s.* from songs inner join song_rate sr on sr.id_song = s.id order by sr.avg(rate) limit by 10", nativeQuery = true)
	List<?> getBestRatedSongs();
	
	@Query(value = "select avg(Rate) from SongRate where id_Song = ?1", nativeQuery = true)
	List<?> getRateByIdSong(int idSong);
}
