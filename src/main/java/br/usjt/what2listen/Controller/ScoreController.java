package br.usjt.what2listen.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.usjt.what2listen.Model.Score;
import br.usjt.what2listen.DTOs.ListenedDTO;
import br.usjt.what2listen.Repository.ScoreRepo;


@RestController
public class ScoreController {
	@Autowired
	private ScoreRepo scoreRepository;

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
	boolean addListenedSong(@RequestBody ListenedDTO dto){
		int nGenre = scoreRepository.getNumberOfGenres(dto.getIdSong());
		return true;
	}
}