package br.usjt.what2listen.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.usjt.what2listen.Model.Song_x_Genre;
import br.usjt.what2listen.Repository.Song_x_GenreRepo;


@RestController
public class Song_x_GenreController {
	@Autowired
	private Song_x_GenreRepo Song_x_GenreRepository;

	@GetMapping("/Song_x_Genre")
	public List<Song_x_Genre> getSong_x_Genre() {
	return (List<Song_x_Genre>) Song_x_GenreRepository.findAll();
	}

	
}