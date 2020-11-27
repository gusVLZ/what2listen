package br.usjt.what2listen.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.usjt.what2listen.Repository.GenreRepo;
import br.usjt.what2listen.Model.Genre;

@RestController
public class GenreController {
    @Autowired
    private GenreRepo genreRepository;

    @GetMapping("/genres")
    public List<Genre> getGenre() {
        return (List<Genre>) genreRepository.findAll();
    }
}
 