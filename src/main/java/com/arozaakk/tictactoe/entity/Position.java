package com.arozaakk.tictactoe.entity;

import lombok.*;

/**
 * @author Abdul Rozak
 * @since 25/02/22
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Position {
    int boardRow;
    int boardColumn;
}
