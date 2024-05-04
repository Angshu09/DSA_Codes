package revise_DSA.Stack.Questions;

import java.util.Arrays;

public class GameOfTwoStacks {
    public static void main(String[] args) {
        int[] first = {4, 2, 4, 6, 1}; //here the arrays are considered as a stack where the top of the stack is index 0
        int[] second = {2, 1, 8, 5};
        int maxSum = 10;
        System.out.println(twoStack(first, second, maxSum)); // The output is - 4
    }

    static int twoStack(int[] first, int[] second, int maxSum){
        return helper(maxSum, first, second, 0, 0) - 1;
    }

    static int helper(int maxSum, int[] first, int[] second, int sum, int count ){
        if(sum > maxSum) return count;

        if(first.length == 0 || second.length == 0) return count;

        int left = helper(maxSum, Arrays.copyOfRange(first, 1, first.length), second, sum + first[0], count + 1);
        int right = helper(maxSum, first, Arrays.copyOfRange(second, 1, second.length), sum + second[0], count + 1);

        return Math.max(left, right);
    }
}
