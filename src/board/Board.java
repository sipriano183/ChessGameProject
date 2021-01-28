package board;

import board.exceptions.BoardException;

public class Board {

	// A board will have rows and columns and many pieces
	private Integer rows;
	private Integer columns;
	private Piece[][] pieces;

	// When the board is initiated it will set a new piece in the row and column set
	// in the constructor
	public Board(Integer rows, Integer columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error when creating board: There must be at least 1 row and 1 column.");

		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public Integer getRows() {
		return rows;
	}

	public Integer getColumns() {
		return columns;
	}

	// Returns a piece set at the written row and column
	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Invalid position.");
		}
		return pieces[row][column];

	}

	// Returns a piece at the set position
	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Invalid position.");
		}
		return pieces[position.getRow()][position.getColumn()];

	}

	// This will place a piece at the given row and column, through the array
	// defined here. It will also change the piece's position.
	public void placePiece(Piece piece, Position position) {
		if(thereIsAPiece(position)) {
			throw new BoardException("Position already taken by another piece.");
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	// This method removes a piece, it declares a piece's position as null and then removes it from the array.
	public Piece removePiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Invalid position.");
		}
		if(piece(position) == null) {
			return null;
		}
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		return aux;
	}

	// This method will check if the position is true, if it is more than 0 and less
	// than the rows/columns it will return true
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}

	// This will verify that the position exists according to the method above
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}

	// This will check if the specified position isn't null, like it is made by
	// default. It must be modified by the placePiece method
	public boolean thereIsAPiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Inexistent position.");
		}
		return piece(position) != null;

	}
	

}
