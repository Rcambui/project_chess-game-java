package com.rcambui.xadrez.application;


import com.rcambui.xadrez.chess.ChessMatch;
import com.rcambui.xadrez.chess.ChessPiece;
import com.rcambui.xadrez.chess.ChessPosition;

import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(scan);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(scan);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }



    }
}
