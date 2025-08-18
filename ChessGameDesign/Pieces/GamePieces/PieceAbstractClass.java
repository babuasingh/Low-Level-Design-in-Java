package ChessGameDesign.Pieces.GamePieces;

import ChessGameDesign.Cell;
import ChessGameDesign.Pieces.Board;

public abstract class PieceAbstractClass {
    private boolean isKilled = false;
    private boolean isWhite;

    public PieceAbstractClass(boolean isWhite){
        this.isWhite=isWhite;
    }

    public boolean getisKilled() {
        return isKilled;
    }

    public void setKilled(boolean killed){
        this.isKilled=killed;
    }

    public boolean getisWhite() {
        return isWhite;
    }

    public abstract boolean canMove(Board board , Cell from , Cell to);
}
