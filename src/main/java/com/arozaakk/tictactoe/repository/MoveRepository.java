package com.arozaakk.tictactoe.repository;

import com.arozaakk.tictactoe.entity.Game;
import com.arozaakk.tictactoe.entity.Move;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Abdul Rozak
 * @since 25/02/22
 */
public interface MoveRepository extends CrudRepository<Move, Long> {

}
