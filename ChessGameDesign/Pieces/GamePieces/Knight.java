package ChessGameDesign.Pieces.GamePieces;

import ChessGameDesign.Cell;
import ChessGameDesign.Pieces.Board;

public class Knight extends PieceAbstractClass {

    public Knight(boolean isWhite){
        super(isWhite);
    }
    @Override
    public boolean canMove(Board board, Cell from, Cell to) {
        return false;
    }

}
