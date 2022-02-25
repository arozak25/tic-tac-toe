package com.arozaakk.tictactoe.service;

import com.arozaakk.tictactoe.entity.Game;
import com.arozaakk.tictactoe.enums.GameStatus;
import com.arozaakk.tictactoe.model.CreateGameWebRequest;
import com.arozaakk.tictactoe.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author Abdul Rozak
 * @since 25/02/22
 */
@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    public Game createNewGame(CreateGameWebRequest request) {
        Game game = Game.builder()
                .playerName(request.getPlayerName())
                .playerPieceCode(request.getPiece())
                .maxBoardColumn(request.getMaxBoardColumn())
                .maxBoardRow(request.getMaxBoardRow())
                .status(GameStatus.ONGOING)
                .createdAt(new Date())
                .build();

        return gameRepository.save(game);
    }

    public Game getById(Long gameId) {
        return gameRepository.findById(gameId).get();
    }
}
