package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;

	public Board(int rows, int columns) {
		if (rows <= 0 || columns <= 0) {
			throw new BoardException("BoardError: The board rows and collumns must be a positive integer");
		}

		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getColumns() {
		return columns;
	}

	public int getRows() {
		return this.rows;
	}

	public Piece[][] getPieces() {
		return pieces;
	}

	public void setPieces(Piece[][] pieces) {
		this.pieces = pieces;
	}

	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Position does not exists on the board");
		}
		return pieces[row][column];
	}

	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position does not exists");
		}
		return pieces[position.getRow()][position.getColumn()];
	}

	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("tried to place a piece on a occupied position");
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}

	public Piece removePiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position does not exists");
		}
		if (piece(position) == null) {
			return null;
		}
		Piece removed_piece = piece(position);
		removed_piece.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		return removed_piece;
	}

	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}

	public boolean positionExists(int row, int col) {
		return row >= 0 && row < rows && col >= 0 && col < columns;
	}

	public boolean thereIsAPiece(Position position) {

		if (!positionExists(position)) {
			throw new BoardException("BoardError: Position does not exists");
		}
		return piece(position) != null;
	}

}