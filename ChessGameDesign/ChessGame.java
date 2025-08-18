package ChessGameDesign;

import ChessGameDesign.Pieces.Board;

//This needs some correction.


public class ChessGame implements BoardGames {
    private static Board board;
    private Status status;
    private Player player1;
    private Player player2;
    private int rows;
    private boolean isWhiteTurn ;

    public ChessGame(Status status,Player player1 , Player player2,int rows){
        this.rows=rows;
        this.status=status;
        this.player1=player1;
        this.player2=player2;
        board = Board.getInstance(rows);
        isWhiteTurn=true;
    }

}
