package game;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// This will initiate a new ChessMatch, which will create a new game Board and will print it through the UI.
				ChessMatch chessMatch = new ChessMatch();
				
				// This while loop keeps the program running and executes the moves according to the source and target
				while (true) {
					UI.printBoard(chessMatch.getPieces());
					System.out.println();
					System.out.print("Source: ");
					ChessPosition source = UI.readChessPosition(sc);
					System.out.println();
					System.out.print("Target: ");
					ChessPosition target = UI.readChessPosition(sc);
					
					ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
				}

	}

}
