package board;

public abstract class Piece {

	// Initial position should not be visible by the game layer.
	protected Position position;
	private Board board;

	// Initial position will be null
	public Piece(Board board) {
		this.board = board;
	}

	// Get method should not be visible by the game layer
	protected Board getBoard() {
		return board;
	}

	// This abstract method will be used by the pieces to make the possible moves
	// logic
	public abstract boolean[][] possibleMoves();

	// This method returns the abstract method at the given position's row and
	// column
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}

	// This method will read the matrix and check if there are any possible moves.
	// It does that by comparing the given position row and column and returning a boolean type
	public boolean isThereAnyPossibleMoves() {
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}

}
