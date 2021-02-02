package game;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import chess.exceptions.ChessException;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// This will initiate a new ChessMatch, which will create a new game Board and
		// will print it through the UI.
		ChessMatch chessMatch = new ChessMatch();

		// This while loop keeps the program running and executes the moves according to
		// the source and target

		while (true) {
			try {
				UI.clearScreen();
				UI.printMatch(chessMatch);
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);
				
				boolean[][] possibleMoves = chessMatch.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces(), possibleMoves);
				System.out.println();
				
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);

				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			}

			catch (ChessException e) {
				System.out.print(e.getMessage());
				sc.nextLine();
			}

			catch (InputMismatchException e) {
				System.out.print(e.getMessage());
				sc.nextLine();
			}
		}

	}
}
