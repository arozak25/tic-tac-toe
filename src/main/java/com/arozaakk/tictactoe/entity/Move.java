package com.arozaakk.tictactoe.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Abdul Rozak
 * @since 25/02/22
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Move {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "game_id", nullable = false)
    private Game game;

    @Column(name = "board_row", nullable = false)
    private int boardRow;

    @Column(name = "board_column", nullable = false)
    private int boardColumn;

    private String playerName;

    private Boolean firstPlayer;

    @Column(name = "created_at", nullable = false)
    private Date createdAt;
}
