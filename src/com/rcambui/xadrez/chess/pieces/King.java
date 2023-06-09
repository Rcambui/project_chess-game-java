package com.rcambui.xadrez.chess.pieces;

import com.rcambui.xadrez.boardgame.Board;
import com.rcambui.xadrez.chess.ChessPiece;
import com.rcambui.xadrez.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
