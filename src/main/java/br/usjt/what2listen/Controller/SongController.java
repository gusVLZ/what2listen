package br.usjt.what2listen.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.usjt.what2listen.Repository.SongRepo;
import br.usjt.what2listen.Model.Song;

@RestController
public class SongController {
    @Autowired
    private SongRepo songRepository;

    @GetMapping("/songs")
    public List<Song> getSong() {
        return (List<Song>) songRepository.findAll();
    }

    @GetMapping("/song")
    public Song getSong(int id) {
        return songRepository.findById(id).get();
    }
}
 