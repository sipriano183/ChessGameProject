package game;

import chess.ChessMatch;

public class App {

	public static void main(String[] args) {
		
		// This will initiate a new ChessMatch, which will create a new game Board and will print it through the UI
				ChessMatch chessMatch = new ChessMatch();
				UI.printBoard(chessMatch.getPieces());

	}

}
