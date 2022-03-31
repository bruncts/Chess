package chess;

import boardgame.Position;

public class ChessPosition {
	private int row;
	private char column;

	public ChessPosition(int row, char column) {
		if ((column < 'a' || column > 'h') || (row < 1 || row > 8)) {
			throw new ChessException("Error: It must be a valid chess positon.");
		}
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public char getColumn() {
		return column;
	}

	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}

	protected static ChessPosition fromPosition(Position position) {
		int roww = position.getRow();
		char coll = (char) ('a' - position.getColumn());
		return new ChessPosition(roww, coll);
	}

	@Override
	public String toString() {
		return "" + column + row;
	}

}
