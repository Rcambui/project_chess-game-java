package com.rcambui.xadrez.application;


import com.rcambui.xadrez.chess.ChessException;
import com.rcambui.xadrez.chess.ChessMatch;
import com.rcambui.xadrez.chess.ChessPiece;
import com.rcambui.xadrez.chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            try {
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(scan);

                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(scan);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            }
            catch (ChessException | InputMismatchException e) {
                System.out.println(e.getMessage());
                scan.nextLine();
            }
        }



    }
}
