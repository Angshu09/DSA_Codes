package revise_DSA.Recursion.Backtracking;

public class Max_knights_in_nxn_board {

    static int knightNumber = 5;

    public static void main(String[] args) {
        int n=3;
        char[][] board = new char[n][n];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++) {
                board[i][j] = '.';
            }
        }
        knight(board, 0, 0, 0);
        System.out.println(knightNumber);
    }

    static void knight(char[][] board, int row, int col, int num){
        int n = board.length;

        if(row == n){
//            if(num==knightNumber){
//                for(int i=0; i<board.length; i++){
//                    for(int j=0; j<board.length; j++){
//                        System.out.print(board[i][j]);
//                    }
//                    System.out.println();
//                }
//                System.out.println();
//            }
            knightNumber = Math.max(knightNumber, num);
            return;
        }
        else if(isSafe(board, row, col)){
            board[row][col] = 'k';
            if(col != n-1){
                knight(board, row, col+1, num+1);
            }
            else{
                knight(board, row+1, 0, num+1);
            }
            board[row][col] = '.'; //Backtracking
        }

        if(col != n-1){
            knight(board, row, col+1, num);
        }
        else{
            knight(board, row+1, 0, num);
        }
    }

    static boolean isSafe(char[][] board, int row, int col){
        int n = board.length;

        int i, j;

        //2 up one right
        i = row-2;
        j = col+1;
        if(i>=0 && j<n && board[i][j] == 'k'){
            return false;
        }
        //2 up one left
        i = row-2;
        j = col-1;
        if(i>=0 && j>=0 && board[i][j] == 'k'){
            return false;
        }

        //2 down one right
        i = row+2;
        j = col+1;
        if(i<n && j<n && board[i][j] == 'k'){
            return false;
        }
        //2 down one left
        i = row+2;
        j = col-1;
        if(i<n && j>=0 && board[i][j] == 'k'){
            return false;
        }

        //2 right one up
        i = row-1;
        j = col+2;
        if(i>=0 && j<n && board[i][j] == 'k'){
            return false;
        }
        //2 right one down
        i = row+1;
        j = col+2;
        if(i<n && j<n && board[i][j] == 'k'){
            return false;
        }

        //2 left one up
        i = row-1;
        j = col-2;
        if(i>=0 && j>=0 && board[i][j] == 'k'){
            return false;
        }
        //2 left one down
        i = row+1;
        j = col-2;
        if(i<n && j>=0 && board[i][j] == 'k'){
            return false;
        }

        return true;
    }
}
