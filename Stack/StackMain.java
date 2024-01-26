package revise_DSA.Stack;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack();
        stack.push(9);
        stack.push(67);
        stack.push(7);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop()); //It throws an exception
    }
}
