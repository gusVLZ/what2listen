package br.usjt.what2listen.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.usjt.what2listen.Model.SongRate;
import br.usjt.what2listen.Repository.SongRateRepo;

@RestController
public class SongRateController {
	    @Autowired
	    private SongRateRepo SongRateRepository;

	    @GetMapping("/Songrate")
	    public List<SongRate> getSongRate() {
	        return (List<SongRate>) SongRateRepository.findAll();
	    }
	    
	    @PostMapping("/Songrate")
	    void addSongRate(@RequestBody SongRate songrate) {
	    	System.out.println(songrate);
	    	SongRateRepository.save(songrate);
	    }

		@GetMapping("/topSongRate")
	    List<?> getTopSongRate() {
	    	return (List<?>) SongRateRepository.getBestRatedSongs();
	    }	    	    
}

