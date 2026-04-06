public class sudoku {

    public static void main(String[] args) {
       char[][] board = {
    {'5','3','.','.','7','.','.','.','.'},
    {'6','.','.','1','9','5','.','.','.'},
    {'.','9','8','.','.','.','.','6','.'},
    {'8','.','.','.','6','.','.','.','3'},
    {'4','.','.','8','.','3','.','.','1'},
    {'7','.','.','.','2','.','.','.','6'},
    {'.','6','.','.','.','.','2','8','.'},
    {'.','.','.','4','1','9','.','.','5'},
    {'.','.','.','.','8','.','.','7','9'}
};


    }
    public static boolean issafe( int board[][],int row,int colm,int digit){

        for (int i = 0; i < board.length; i++) {
            if (board[i][colm]==digit) {
                return false;
                
            }
            if (board[row][colm]==digit) {
                return false;
                
            }

            int topgrid = (row/3)*3;
            int sidegrid =(colm/3)*3;

            for (int j = topgrid; j <topgrid+3; j++) {

                for (int j2 = sidegrid; j2 <sidegrid+3; j2++) {

                    if (board[j][j2]==digit) {
                        return false;
                        
                    }
                    
                }
                
            }
        }


        return true;

    }

    public static boolean solvesudoku(int board[][], int row , int colm ){


        if (colm==9) {

            colm=0;
            row++;
            
        }
        if(row == 9) return true;

    // skip filled cell
      if(board[row][colm] != '.'){
        return solvesudoku(board, row, colm+1);
    }

        for (int i = 1; i <=9; i++) {
            
            if (issafe(board,row,colm,i)) {

                if(solvesudoku(board, row, colm)){
                    return true;
                }
                 

    
                
            }
            else if(i==9 && !issafe(board,row,colm,i)){
                return false ;
            }

            solvesudoku(board, row, colm);


        }
        return false;



        
    }
}