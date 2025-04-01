package br.com.unicuritiba.GamesLibrary.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.unicuritiba.GamesLibrary.models.Game;
import br.com.unicuritiba.GamesLibrary.repositories.GameRepository;

@RestController
public class GameController {
	
	@Autowired
	GameRepository repository;
	
	@GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }
	
	@GetMapping("/games")
	public ResponseEntity<List<Game>> getGames() {
		
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping("/games")
	public ResponseEntity<Game> saveGame(@RequestBody Game game) {
		Game gameSalvo = repository.save(game);
		
		return ResponseEntity.ok(gameSalvo);
	}
	
	@PutMapping("/games/{id}")
	public ResponseEntity<Game> updateGame(@PathVariable long id, @RequestBody Game game) {
	    if (!repository.existsById(id)) {
	        return ResponseEntity.notFound().build();
	    }
	    
	    game.setId(id);
	    Game updatedGame = repository.save(game);
	    
	    return ResponseEntity.ok(updatedGame);
	}


	@DeleteMapping("/games/{id}")
	public void removeGame(@PathVariable long id) {
		repository.deleteById(id);
	}
}
