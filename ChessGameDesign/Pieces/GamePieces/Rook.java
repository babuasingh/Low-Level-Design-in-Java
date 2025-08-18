package ChessGameDesign.Pieces.GamePieces;

import ChessGameDesign.Cell;
import ChessGameDesign.Pieces.Board;

public class Rook extends PieceAbstractClass {
    public Rook(boolean isWhite){
        super(isWhite);
    }

    @Override
    public boolean canMove(Board board, Cell from, Cell to) {
        return false;
    }

}
