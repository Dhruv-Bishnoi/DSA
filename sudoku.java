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

        if (solveSudoku(board, 0, 0)) {
            System.out.println("solution found");
             for(char[] row : board){
            for(char c : row){
                System.out.print(c + " ");
            }
            System.out.println();
        }
            
        }
        else{
            System.out.println("can not be solved");
        }

        // print result
       
    }

    public static boolean isSafe(char[][] board, int row, int col, char d){

        // column
        for(int i = 0; i < 9; i++){
            if(board[i][col] == d) return false;
        }

        // row
        for(int j = 0; j < 9; j++){
            if(board[row][j] == d) return false;
        }

        // grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;

        for(int i = sr; i < sr+3; i++){
            for(int j = sc; j < sc+3; j++){
                if(board[i][j] == d) return false;
            }
        }

        return true;
    }

    public static boolean solveSudoku(char[][] board, int row , int col){

        if(col == 9){
            row++;
            col = 0;
        }

        if(row == 9) return true;

        if(board[row][col] != '.'){
            if(isSafe(board, row, col, board[row][col])){
                
                return solveSudoku(board, row, col+1);
            }
            else{

                return false;
            }
        }

        for(char d = '1'; d <= '9'; d++){

            if(isSafe(board, row, col, d)){

                board[row][col] = d;

                if(solveSudoku(board, row, col+1)){
                    return true;
                }

                board[row][col] = '.'; // backtrack
            }
        }

        return false;
    }
}