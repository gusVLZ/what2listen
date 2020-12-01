package br.usjt.what2listen.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.usjt.what2listen.Model.Genre;
import br.usjt.what2listen.Model.SongGenre;
import br.usjt.what2listen.Repository.SongGenreRepo;
import br.usjt.what2listen.Repository.GenreRepo;

@RestController
public class SongGenreController {
	@Autowired
	private SongGenreRepo songGenreRepository;
	@Autowired
	private GenreRepo genreRepository;

	@GetMapping("/SongGenre")
	public List<SongGenre> getSongGenre() {
		return (List<SongGenre>) songGenreRepository.findAll();
	}
	
	@GetMapping("/getGenreByIdSong")
	public List<Genre> getGenreByIdSong(int idSong) {
		return (List<Genre>) genreRepository.getGenreById(idSong);
	}
}