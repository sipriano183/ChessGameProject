package chess;

import board.Position;
import chess.exceptions.ChessException;

public class ChessPosition {
	
	private char column;
	private int row;
	
	// This will check if the ChessPosition exists, if not it throws an exception
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error initiating chess position: Valid values must be from a1 to h8");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	/* The array position pattern is different than a normal chess game position pattern. These two methods will change the position type
	 * accordingly, the first one transforms an Array Position into a normal chess pattern and the second one will do the reverse
	 */
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
		
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
	
	
	
	
	
	
	

}
