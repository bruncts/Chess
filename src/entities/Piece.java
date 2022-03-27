package entities;

abstract class Piece {
	private int line;
	private int row;
	
	public Piece(int line, int row, char color) {
		super();
		this.line = line;
		this.row = row;

	}
	public int getLine() {
		return line;
	}
	public int getRow() {
		return row;
	}

	
	abstract void move(int row, int line) ;
}
