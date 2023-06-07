package com.rcambui.xadrez.application;


import com.rcambui.xadrez.chess.ChessMatch;


public class Program {

    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
