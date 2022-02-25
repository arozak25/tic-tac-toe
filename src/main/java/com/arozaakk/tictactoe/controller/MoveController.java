package com.arozaakk.tictactoe.controller;

import com.arozaakk.tictactoe.entity.Game;
import com.arozaakk.tictactoe.entity.Move;
import com.arozaakk.tictactoe.model.CreateGameWebRequest;
import com.arozaakk.tictactoe.model.CreateMoveWebRequest;
import com.arozaakk.tictactoe.service.GameService;
import com.arozaakk.tictactoe.service.MoveService;
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
public class MoveController {

    @Autowired
    HttpSession httpSession;

    @Autowired
    MoveService moveService;

    @PostMapping(value = "/game")
    public Move createMove(@RequestBody CreateMoveWebRequest webRequest) {

        return moveService.createMove(webRequest);
    }
}
