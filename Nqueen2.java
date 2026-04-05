public class Nqueen2 {
   public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        int count = 0;
        for (int i = 0; i < board.length; i++) {
    for (int j = 0; j < board.length; j++) {
        board[i][j] = '.';
    }
}
       
        System.out.println(queen(board, 0));

    }

    public static boolean isSafe(char board[][], int row, int col) {

        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'q') {

                return false;

            }

        }


            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {

                if (board[i][j] == 'q') {
                    return false;

                }

            }

            for (int i = row -1, j = col +1; i >= 0 && j < board.length; i--, j++) {

                if (board[i][j] == 'q') {
                    return false;

                }

            }
        

        return true;
    }

    

    public static int queen(char board[][], int row) {

        if (row == board.length) {
           
            
            return 1;

        }
        int count = 0;

        for (int j = 0; j < board.length; j++) {

            if (isSafe(board, row, j)) {

                board[row][j] = 'q';

                count+=queen(board, row + 1);
                board[row][j] = '.';   
            }

        }
        return count;

    }
    

}
