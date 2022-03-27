package boardgame;

public class Board {
	private int row;
	private int columns;
	private Piece[][] pieces;
	public Board(int row, int columns) {
		super();
		this.row = row;
		this.columns = columns;
		pieces = new Piece[row][columns];
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	public Piece[][] getPieces() {
		return pieces;
	}
	public void setPieces(Piece[][] pieces) {
		this.pieces = pieces;
	}
	
}
