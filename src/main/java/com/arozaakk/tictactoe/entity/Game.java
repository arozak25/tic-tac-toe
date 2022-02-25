package com.arozaakk.tictactoe.entity;

import com.arozaakk.tictactoe.enums.GameStatus;
import com.arozaakk.tictactoe.enums.MovePiece;
import lombok.*;
import org.hibernate.annotations.Check;

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
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String playerName;

    @Enumerated(EnumType.STRING)
    private MovePiece playerPieceCode;

    @Enumerated(EnumType.STRING)
    private GameStatus status;

    private Integer maxBoardRow;

    private Integer maxBoardColumn;

    @Column(name = "created_at", nullable = false)
    private Date createdAt;
}
