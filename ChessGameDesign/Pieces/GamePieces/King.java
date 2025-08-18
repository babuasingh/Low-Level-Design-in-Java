package ChessGameDesign.Pieces.GamePieces;

import ChessGameDesign.Cell;
import ChessGameDesign.Pieces.Board;

public class King extends PieceAbstractClass {
    public King(boolean isWhite){
        super(isWhite);
    }
    @Override
    public boolean canMove(Board board, Cell from, Cell to) {
        return false;
    }
}
