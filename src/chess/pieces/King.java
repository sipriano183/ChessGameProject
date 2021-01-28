package chess.pieces;

import board.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}
	
	// This piece will inherit the ChessPiece class and will be set up in the board by the logic set in the ChessMatch class.
	@Override
	public String toString() {
		return "K";
	}

}
