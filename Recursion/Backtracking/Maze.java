package revise_DSA.Recursion.Backtracking;

import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {

        printPaths("", 3, 3);
//
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
//        mazeWithRestrictions("", maze, 0, 0);

        boolean[][] maze2 = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
//        mazeWithBackTracking("", maze2, 0, 0);

        int[][] path = new int[maze2.length][maze2[0].length];
        mazeWithBackTrackingPath("", maze2, 0, 0, path, 1);
    }

    static int countRoutes(int r, int c){
        if(r==1 || c==1){
            return 1;
        }

        int left = countRoutes(r-1, c);
        int right = countRoutes(r, c-1);

        return left+right;
    }

    static void printPaths(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r>1){
            printPaths(p+'D', r-1, c);
        }

        if(c>1){
            printPaths(p+'R', r, c-1);
        }
    }

    static void mazeWithRestrictions(String str, boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(str);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        if(r < maze.length-1){
            mazeWithRestrictions(str+'D', maze, r+1, c);
        }

        if(c< maze[0].length-1){
            mazeWithRestrictions(str+'R', maze, r, c+1);
        }
    }

    static void mazeWithBackTracking(String str, boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(str);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;

        if(r < maze.length-1){
            mazeWithBackTracking(str+'D', maze, r+1, c);
        }

        if(c< maze[0].length-1){
            mazeWithBackTracking(str+'R', maze, r, c+1);
        }

        if(r>0){
            mazeWithBackTracking(str+'U', maze, r-1, c);
        }

        if(c>0){
            mazeWithBackTracking(str+'L', maze, r, c-1);
        }

        maze[r][c] = true;
    }

    static void mazeWithBackTrackingPath(String str, boolean[][] maze, int r, int c, int[][] path, int step){
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c] = step;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(str);
            System.out.println();
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length-1){
            mazeWithBackTrackingPath(str+'D', maze, r+1, c, path, step+1);
        }

        if(c< maze[0].length-1){
            mazeWithBackTrackingPath(str+'R', maze, r, c+1, path, step+1);
        }

        if(r>0){
            mazeWithBackTrackingPath(str+'U', maze, r-1, c, path, step+1);
        }

        if(c>0){
            mazeWithBackTrackingPath(str+'L', maze, r, c-1, path, step+1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
