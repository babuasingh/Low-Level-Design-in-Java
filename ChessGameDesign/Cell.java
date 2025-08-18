package ChessGameDesign;

import ChessGameDesign.Pieces.GamePieces.PieceAbstractClass;

public class Cell {
    private int row;
    private int col;
    private PieceAbstractClass piece;

    public Cell(int row, int col, PieceAbstractClass piece) {
        this.row = row;
        this.col = col;
        this.piece = piece;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }


    public PieceAbstractClass getPiece() {
        return piece;
    }

}
