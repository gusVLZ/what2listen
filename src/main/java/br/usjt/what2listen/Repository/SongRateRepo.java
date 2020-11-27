package br.usjt.what2listen.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.usjt.what2listen.Model.SongRate;

@Repository
public interface SongRateRepo extends CrudRepository<SongRate, Integer> {

	
	@Query(value="select sg.id as songId, sg.name as songName, sg.artist, gr.id, gr.name, avg(sr.rate) as 'rate' from song_rate as sr\r\n" + 
			"LEFT JOIN song as sg ON\r\n" + 
			"sg.id = sr.id_song\r\n" +
            "LEFT JOIN song_x_genre as sxg ON\r\n" + 
			"sxg.id_song = sg.id\r\n" +
            "LEFT JOIN genre as gr ON\r\n" + 
			"gr.id = sxg.id_genre\r\n" +
			"RIGHT JOIN user_x_genre AS uxg ON\r\n" +
			"uxg.id_genre = gr.id\r\n" +
			"WHERE uxg.id_user = 1 AND sr.id_song NOT IN (SELECT id_song FROM song_rate WHERE id_user = 1 GROUP BY id_song)\r\n"+             			
			"GROUP BY sg.id, sg.name, sg.artist, gr.id, gr.name\r\n" + 
			"ORDER BY avg(sr.rate) DESC LIMIT 5 ", nativeQuery=true)
	List<?> getBestRatedSongs();

}
