package ChessGameDesign.Pieces.GamePieces;

import ChessGameDesign.Cell;
import ChessGameDesign.Pieces.Board;

public class Pawn extends PieceAbstractClass {
    
    public Pawn(boolean isWhite){
        super(isWhite);
    }
    @Override
    public boolean canMove(Board board, Cell from, Cell to) {
        return false;
    }
}
