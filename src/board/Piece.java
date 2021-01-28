package board;

public class Piece {
	
	// Initial position should not be visible by the game layer.
	protected Position position;
	private Board board;
	
	// Initial position will be null
	public Piece(Board board) {
		this.board = board;
	}

	// Get method should not be visible by the game layer since its for internal use
	protected Board getBoard() {
		return board;
	}
	
	

}
