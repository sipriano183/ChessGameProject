package chess;

import board.Board;
import board.Piece;

public abstract class ChessPiece extends Piece {
	
	private Color color;
	private int moveCount;
	
	// This cless will inherit the board set in the Piece superclass
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	
	
}
