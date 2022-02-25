package com.arozaakk.tictactoe.repository;

import com.arozaakk.tictactoe.entity.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Abdul Rozak
 * @since 25/02/22
 */
@Repository
public interface GameRepository extends CrudRepository<Game, Long> {

}
