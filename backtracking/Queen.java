package backtracking;
import java.util.*;

public class Queen {


    public static boolean isSafe(char[][]board,int row,int col){
        //check if queen is placed in same row
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }

        //check if queen is placed in same column
        for(int j=0;j<board.length;j++)
        {
            if(board[j][col]=='Q'){
                return false;
            }
        }

        //check diagonals(upper left:(row-1,col-1),upper right:(row-1,col+1),
        //lower left:(row+1,col-1),lower right(row+1,col+1))

        //upper left
        int r=row;
        for(int c=col;c>=0&&r>=0;c--,r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        //upper right
         r=row;
        for(int c=col;c<board.length&&r>=0;c++,r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        //lower left
        r=row;
        for(int c=col;r<board.length&&c>=0;c--,r++){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        //lower right
        r=row;
        for(int c=col;r<board.length&&c<board.length;c++,r++){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        return true;

    }
    
    public static void saveSolution(char[][]board,List<List<String>>allBoards){
        String row="";
        List<String>newBoard=new ArrayList<>();

        for(int i=0;i<board.length;i++)
        {
            row="";
            for(int j=0;j<board.length;j++)
            {
                if(board[i][j]=='Q'){
                    row+='Q';
                }
                else{
                    row+=".";
                }
            }
            newBoard.add(row);
        }

        allBoards.add(newBoard);

       System.out.println(allBoards);
    }

    public static void helper(char[][]board,List<List<String>>allBoards,int col){

        if(col==board.length){
            saveSolution(board,allBoards);
            return;
        }

        for(int row=0;row<board.length;row++){
            if(isSafe(board,row,col)){
                board[row][col]='Q';
                helper(board,allBoards,col+1);
                board[row][col]='.';
            }
        }
    }

    public static void main(String args[]){
        List<List<String>>allBoards=new ArrayList<>();
        int n=4;
        char [][]board=new char[n][n];
        helper(board,allBoards,0);
    }
}
