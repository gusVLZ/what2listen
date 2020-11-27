package br.usjt.what2listen.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.Utils.Globals;
import br.usjt.what2listen.Exception.GenericError;
import br.usjt.what2listen.Model.Genre;
import br.usjt.what2listen.Model.UserTable;
import br.usjt.what2listen.Model.UserGenre;
import br.usjt.what2listen.Repository.GenreRepo;
import br.usjt.what2listen.Repository.UserGenreRepo;
import br.usjt.what2listen.Repository.UserRepo;


@RestController
public class UserController {
	@Autowired
	private UserRepo userRepository;
	@Autowired
	private GenreRepo genreRepository;
	@Autowired
	private UserGenreRepo ugRepository;

	@GetMapping("/UserTable")
	public List<UserTable> getUser() {
		return (List<UserTable>) userRepository.findAll();
	}

	@PostMapping("/UserTable")
	void addCliente(@RequestBody UserTable user) {
		userRepository.save(user);
	}

	@GetMapping("/FavGenres/{idUser}")
	List<Genre> favGenres(@PathVariable(value="idUser") int id){
		return genreRepository.getFavGenres(id);
	}

	@PostMapping("/AddFavGenre/{idGenre}")
	boolean addFavGenre(@PathVariable(value="idGenre") int idGenre){
		UserGenre ug = new UserGenre(0, Globals.usuarioLogado.getId(), idGenre);
		try{
			ugRepository.save(ug);
			return true;
		}catch(Exception e){
			throw new GenericError(e);
		}
	}
}