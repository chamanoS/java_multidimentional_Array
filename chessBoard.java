import java.lang.reflect.Array;

public class chessBoard {
    public static void main(String[] args)  {
        int boardDim = 8;
        char[][] board = new char[boardDim][boardDim];
        boolean isWhite = false;
        
        for(int y = 0; y< board.length; y++){
            isWhite =!isWhite;
             for(int x = 0; x< board[y].length; x++){
            if(isWhite) board[y][x] = 'X';
            if(!isWhite) board[y][x] = 'M';
            isWhite = !isWhite;
            
        }
        }

        for(int i = 0; i<board.length;i++){
            System.out.println(Array.toString(board));
        }
    }
}
