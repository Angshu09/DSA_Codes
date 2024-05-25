package revise_DSA.Trees;

//You are given an array and a tree you have to find the path that is given to the array.

import java.util.Scanner;

public class FindPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTrees tree = new BinaryTrees();
        tree.populate(sc);

        int[] arr ={3, 9, 12, 8};
        boolean ans = findPath(tree.root, arr);
        if(ans){
            System.out.println(ans + " : Your Given Path Is Available");
        }
        else{
            System.out.println(ans + " : Your Given Path Is Not Available");
        }

    }

    private static boolean findPath(BinaryTrees.Node root, int[] arr){
        if(root ==null){
            return arr.length ==0;
        }

        return helper(root, arr, 0);
    }

    private static boolean helper(BinaryTrees.Node node, int[] arr, int index){
        if(node == null) {
            return false;
        }

        if(index >= arr.length || node.val != arr[index]){
            return false;
        }

        if(node.left == null && node.right == null && index == arr.length - 1){
            return true;
        }

        return helper(node.left, arr, index +1) || helper(node.right, arr, index + 1);
    }
}
