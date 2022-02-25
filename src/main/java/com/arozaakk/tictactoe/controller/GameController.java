package com.arozaakk.tictactoe.controller;

import com.arozaakk.tictactoe.entity.Game;
import com.arozaakk.tictactoe.model.CreateGameWebRequest;
import com.arozaakk.tictactoe.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author Abdul Rozak
 * @since 25/02/22
 */
@RestController
public class GameController {

    @Autowired
    HttpSession httpSession;

    @Autowired
    GameService gameService;

    @PostMapping(value = "/game")
    public Game createNewGame(@RequestBody CreateGameWebRequest webRequest) {

        Game game = gameService.createNewGame(webRequest);
        httpSession.setAttribute("gameId", game.getId());

        return game;
    }
}
