package ChessGameDesign.Pieces.GamePieces;

import ChessGameDesign.Cell;
import ChessGameDesign.Pieces.Board;

public class Queen extends PieceAbstractClass {
    public Queen(boolean isWhite){
        super(isWhite);
    }
    @Override
    public boolean canMove(Board board, Cell from, Cell to) {
        return false;
    }
}
