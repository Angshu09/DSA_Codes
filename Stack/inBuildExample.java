package revise_DSA.Stack;

import java.util.Stack;

public class inBuildExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(56);
        stack.push(78);
        stack.push(90);
        stack.push(34);

        System.out.println(stack.pop());
        System.out.println(stack.pop());

//        O(1) time - constant
    }
}
