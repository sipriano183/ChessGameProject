package chess;

import board.Board;
import board.Piece;
import board.Position;

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
	
	public int getMoveCount() {
		return moveCount;
	}
	
	public void increaseMoveCount() {
		moveCount++;
	}
	
	public void decreaseMoveCount() {
		moveCount--;
	}
	
	// This method returns the chess position, converting it from the normal matrix position
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	// This method checks if there is an opponent piece on the piece's possible moves, it does that by checking the colors
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
		
	}
	
	
	
}
