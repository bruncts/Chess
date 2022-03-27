package entities;

abstract class Piece {
	private int line;
	private int row;
	private char color;

	public Piece(int line, int row, char color) {
		super();
		this.line = line;
		this.row = row;
		this.color = color;
	}
	public int getLine() {
		return line;
	}
	public int getRow() {
		return row;
	}
	public char getColor() {
		return color;
	}
	
	abstract void move(int row, int line) ;
}
