package com.arozaakk.tictactoe.model;

import com.arozaakk.tictactoe.enums.MovePiece;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Abdul Rozak
 * @since 25/02/22
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateGameWebRequest {
    private MovePiece piece;
    private String playerName;
    private Integer maxBoardRow;
    private Integer maxBoardColumn;
}
