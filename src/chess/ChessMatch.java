package chess;

import board.Board;

public class ChessMatch {
	
	private Board board;

	// This constructor will creat a new game board when created
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	// This method will return a ChessPiece and not an internal piece through downcasting the type ChessPiece to the piece method
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	

}
