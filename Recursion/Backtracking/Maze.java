package revise_DSA.Recursion.Backtracking;

public class Maze {
    public static void main(String[] args) {
        System.out.println(countRoutes(3, 3));
        printPaths("", 3, 3);
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
}
