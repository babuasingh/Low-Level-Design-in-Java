package ChessGameDesign.Pieces.GamePieces;

public class PieceFactory {

    public static PieceAbstractClass getPiece(String type,boolean isWhite){
        if(type.equalsIgnoreCase("bishop")){
            return new Bishop(isWhite);
        }else if(type.equalsIgnoreCase("King")){
            return new King(isWhite);
        }else if(type.equalsIgnoreCase("Knight")){
            return new Knight(isWhite);
        }else if(type.equalsIgnoreCase("Pawn")){
            return new Pawn(isWhite);
        }else if(type.equalsIgnoreCase("queen")){
            return new Queen(isWhite);
        }else if(type.equalsIgnoreCase("Rook")){
            return new Rook(isWhite);
        }else{
            System.out.println("Invalid Piece type");
            return null;
        }
    }
}
