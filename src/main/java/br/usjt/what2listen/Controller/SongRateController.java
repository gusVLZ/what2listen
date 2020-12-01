package br.usjt.what2listen.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.usjt.what2listen.Model.SongRate;
import br.usjt.what2listen.Repository.SongRateRepo;
import br.usjt.what2listen.Utils.Globals;

@RestController
public class SongRateController {
	@Autowired
	private SongRateRepo SongRateRepository;

	@GetMapping("/Songrate")
	public List<SongRate> getSongRate() {
		return (List<SongRate>) SongRateRepository.findAll();
	}

	@PostMapping("/Songrate")
	public SongRate addSongRate(@RequestBody SongRate songrate) {
		System.out.println(songrate);
		return SongRateRepository.save(songrate);
	}

	@GetMapping("/RecomendedSongs")
	public String[][] getRecomendedSongs() {
		return SongRateRepository.getRecomendedSongs(Globals.usuarioLogado.getId());
	}

	@GetMapping("/BestRatedSongs")
	public List<?> getBestRatedSongs() {
		return (List<?>) SongRateRepository.getBestRatedSongs();
	}
	
	@GetMapping("/getRateByIdSong")
	public String getRateByIdSong(int idSong) {
		return (String) SongRateRepository.getRateByIdSong(idSong);
	}
}
