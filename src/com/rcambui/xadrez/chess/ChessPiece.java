package com.rcambui.xadrez.chess;

import com.rcambui.xadrez.boardgame.Board;
import com.rcambui.xadrez.boardgame.Piece;

public abstract class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }
    public Color getColor() {
        return color;
    }
}
