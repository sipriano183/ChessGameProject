package board;

public class Board {
	
	private Integer rows;
	private Integer columns;
	
	public Board(Integer rows, Integer columns) {
		this.rows = rows;
		this.columns = columns;
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
	
	public Piece piece(int row, int column) {
		
	}
	
	

}
