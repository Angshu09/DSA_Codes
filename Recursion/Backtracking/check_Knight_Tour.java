package revise_DSA.Recursion.Backtracking;

public class check_Knight_Tour {
    public static void main(String[] args) {
        int[][] grid = {
                {0,11,16,5,20},{17,4,19,10,15},{12,1,8,21,6},{3,18,23,14,9},{24,13,2,7,22}
        };

        int[][] grid2 = {
                {0, 3, 6},
                {5, 8, 1},
                {2, 7, 4}
        };

        System.out.println(checkValidGrid(grid2));
    }

    public static boolean checkValidGrid(int[][] grid){
        if(grid[0][0] != 0){
            return false;
        }
        return helper(grid, 0, 0, 0);
    }

    public static boolean helper(int[][] grid, int row, int col, int num){
        int n = grid.length;
        if(grid[row][col] == n*n-1){
            return true;
        }

        int i, j;

        //2 up one right
        i = row-2;
        j = col+1;
        if(i>=0 && j<n && grid[i][j] == num+1){
            return helper(grid, i, j, num+1);
        }
        //2 up one left
        i = row-2;
        j = col-1;
        if(i>=0 && j>=0 && grid[i][j] == num+1){
            return helper(grid, i, j, num+1);
        }

        //2 down one right
        i = row+2;
        j = col+1;
        if(i<n && j<n && grid[i][j] == num+1){
            return helper(grid, i, j, num+1);
        }
        //2 down one left
        i = row+2;
        j = col-1;
        if(i<n && j>=0 && grid[i][j] == num+1){
            return helper(grid, i, j, num+1);
        }

        //2 right one up
        i = row-1;
        j = col+2;
        if(i>=0 && j<n && grid[i][j] == num+1){
            return helper(grid, i, j, num+1);
        }
        //2 right one down
        i = row+1;
        j = col+2;
        if(i<n && j<n && grid[i][j] == num+1){
            return helper(grid, i, j, num+1);
        }

        //2 left one up
        i = row-1;
        j = col-2;
        if(i>=0 && j>=0 && grid[i][j] == num+1){
            return helper(grid, i, j, num+1);
        }
        //2 left one down
        i = row+1;
        j = col-2;
        if(i<n && j>=0 && grid[i][j] == num+1){
            return helper(grid, i, j, num+1);
        }

        return false;
    }


}
