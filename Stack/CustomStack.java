package revise_DSA.Stack;

public class CustomStack {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int n){
        if(isFull()){
            System.out.println("Your stack in full!!");
            return false;
        }
        ptr ++;
        data[ptr] = n;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from an empty stack");
        }
        return data[ptr];
    }

    private boolean isFull(){
        return ptr == data.length - 1;
    }

    private boolean isEmpty(){
        return ptr == -1;
    }
}
