package board.exceptions;

public class BoardException extends Exception {
	private static final long serialVersionUID = 1L;
	
	private String msg;
	
	public BoardException(String msg) {
		super(msg);
	}

}