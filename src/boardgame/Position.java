package boardgame;

public class Position {
	private int row;
	private int column;

	public Position(int line, int row) {
		this.row = line;
		this.column = row;
	}

	@Override
	public String toString() {
		return row + "," + column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int line) {
		this.row = line;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int row) {
		this.column = row;
	}

	public void move(int row, int line) {

	}
}