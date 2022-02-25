package com.arozaakk.tictactoe.service;

import com.arozaakk.tictactoe.entity.Move;
import com.arozaakk.tictactoe.model.CreateMoveWebRequest;
import com.arozaakk.tictactoe.repository.GameRepository;
import com.arozaakk.tictactoe.repository.MoveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author Abdul Rozak
 * @since 25/02/22
 */
@Service
public class MoveService {

    @Autowired
    GameRepository gameRepository;

    @Autowired
    MoveRepository moveRepository;

    public Move createMove(CreateMoveWebRequest request) {
        Move move = Move.builder()
                .game(gameRepository.findById(request.getGameId()).get())
                .boardColumn(request.getBoardColumn())
                .boardRow(request.getBoardRow())
                .playerName(request.getPlayerName())
                .firstPlayer(request.getFirstPlayer())
                .createdAt(new Date())
                .build();

        return moveRepository.save(move);
    }
}
