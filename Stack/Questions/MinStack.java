package revise_DSA.Stack.Questions;

// Link - https://leetcode.com/problems/min-stack/

//Method 1(using a extra stack)
/*class MinStack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> gt = new Stack<>();

    public MinStack() {

    }

    public void push(int val) {
        if(st.isEmpty()){
            st.push(val);
            gt.push(val);
        }
        else{
            if(gt.peek() <= val){
                gt.push(gt.peek());
            }
            else{
                gt.push(val);
            }
            st.push(val);
        }
    }

    public void pop() {
        gt.pop();
        st.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return gt.peek();
    }
}*/


public class MinStack {
}
