package ChessGameDesign.Pieces;

import ChessGameDesign.Cell;

public class Board {

    private static Board board;
    private int rows;
    static Cell[][] cells;


    private Board(int rows){
        this.rows=rows;
        initializeBoard(rows);
    }

    public static Board getInstance(int rows){
        if(board==null){
            board=new Board(rows);
        }
        return board;
    }

    private void initializeBoard(int rows) {
        cells=new Cell[rows][rows];
    }

}
