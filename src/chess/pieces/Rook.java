package chess.pieces;

import board.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece{

	// This constructor will define the board that the piece is on and it's Color, sending it to the superclass's constructor
	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	// This piece will inherit the ChessPiece class and will be set up in the board by the logic set in the ChessMatch class.
	@Override
	public String toString() {
		return "R";
	}
	

}
