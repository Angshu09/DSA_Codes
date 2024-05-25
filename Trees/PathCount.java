package revise_DSA.Trees;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class PathCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTrees tree =new BinaryTrees();
        tree.populate(sc);
        System.out.println(pathCount(tree.root, 4));
    }

    private static int pathCount(BinaryTrees.Node node, int sum){
        ArrayList<Integer> path = new ArrayList<>();
        return helper(node, sum, path);
    }

    private static int helper(BinaryTrees.Node node, int sum, ArrayList<Integer> path){
        if(node == null) {
            return 0;
        }

        path.add(node.val);
        int count = 0;
        int s = 0;

        ListIterator<Integer> ltr = path.listIterator(path.size());
        while(ltr.hasPrevious()){
            s += ltr.previous();

            if(s==sum){
                count++;
            }
        }

        count += helper(node.left, sum, path) + helper(node.right, sum,path);

        path.remove(path.size() - 1);

        return count;
    }

    //put in a list
    private static ArrayList<ArrayList<Integer>>  pathCountInList(BinaryTrees.Node node, int sum){
        ArrayList<ArrayList<Integer>> paths = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
         helper2(node, sum, path, paths);
         return paths;
    }

    private static void helper2(BinaryTrees.Node node, int sum, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> paths){
        if(node == null) {
            return;
        }

        path.add(node.val);

        if(node.val == sum && node.left == null && node.right == null){
            paths.add(new ArrayList<>(path));
        }
        else{
            helper2(node.left, sum-node.val, path, paths);
            helper2(node.right, sum-node.val, path, paths);
        }


        path.remove(path.size() - 1);
    }
}
