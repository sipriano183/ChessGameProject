package board;

public class Board {
	
	// A board will have rows and columns and many pieces
	private Integer rows;
	private Integer columns;
	private Piece[][] pieces;
	
	// When the board is initiated it will set a new piece in the row and column set in the constructor
	public Board(Integer rows, Integer columns) {
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

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public void setColumns(Integer columns) {
		this.columns = columns;
	}
	
	// Returns a piece set at the written row and column
	public Piece piece(int row, int column) {
		return pieces[row][column];
		
	}
	
	// Returns a piece at the set position
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
		
	}
	
	// This will place a piece at the given row and column, through the array defined here. It will also change the piece's position.
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	

}
