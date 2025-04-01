package br.com.unicuritiba.GamesLibrary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicuritiba.GamesLibrary.models.Game;

public interface GameRepository 
			extends JpaRepository<Game, Long> {

}
