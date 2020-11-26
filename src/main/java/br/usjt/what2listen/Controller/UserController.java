package br.usjt.what2listen.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.usjt.what2listen.DTOs.FavGenresDTO;
import br.usjt.what2listen.Model.User;
import br.usjt.what2listen.Repository.UserRepo;


@RestController
public class UserController {
	@Autowired
	private UserRepo userRepository;

	@GetMapping("/User")
	public List<User> getUser() {
		return (List<User>) userRepository.findAll();
	}

	@PostMapping("/User")
	void addCliente(@RequestBody User user) {
		userRepository.save(user);
	}

	/*@GetMapping("/FavGenres/{idUser}")
	List<FavGenresDTO> favGenres(@PathVariable(value="idUser") int id){
		userRepository.favGenres(id);
	}*/
}