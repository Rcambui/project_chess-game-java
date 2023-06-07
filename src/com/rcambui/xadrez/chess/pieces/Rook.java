package com.rcambui.xadrez.chess.pieces;

import com.rcambui.xadrez.boardgame.Board;
import com.rcambui.xadrez.chess.ChessPiece;
import com.rcambui.xadrez.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
