package br.usjt.what2listen.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.usjt.what2listen.Model.Score;
import br.usjt.what2listen.Model.SongGenre;
import br.usjt.what2listen.DTOs.ListenedDTO;
import br.usjt.what2listen.Repository.ScoreRepo;
import br.usjt.what2listen.Repository.SongGenreRepo;
import br.usjt.what2listen.Exception.*;

@RestController
public class ScoreController {
	@Autowired
	private ScoreRepo scoreRepository;
	@Autowired
	private SongGenreRepo songGenreRepository;

	@GetMapping("/Score")
	public List<Score> getScore() {
		return (List<Score>) scoreRepository.findAll();
	}

	@PostMapping("/Score")
	void addScore(@RequestBody Score score) {
		System.out.println(score);
		scoreRepository.save(score);
	}

	@PostMapping("/Listen")
	boolean addListenedSong(@RequestBody ListenedDTO dto) {
		try {
			List<SongGenre> sGenres = songGenreRepository.getSongGenres(dto.getIdSong());
			int sGenresLength = sGenres.size();
			List<Score> scores = new ArrayList<>();

			sGenres.forEach(item -> {
				scores.add(new Score(null, dto.getIdUser(), item.getId(), 6 / sGenresLength));
			});

			scoreRepository.saveAll(scores);
		} catch (Exception e) {
			throw new GenericError(e);
		}
		return true;
	}
}