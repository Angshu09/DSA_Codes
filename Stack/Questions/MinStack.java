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

//Method 2
/* MinStack {

    Stack<Long> st = new Stack<>();
    long min = -1;

    public MinStack() {

    }

    public void push(int val) {
        if(st.isEmpty()){
            st.push((long)val);
            min = (long)val;
        }
        else if(val >= min){
            st.push((long)(val));
        }
        else{
            st.push(2*(long)(val)-min);
            min = (long)val;
        }
    }

    public void pop() {
        if(st.isEmpty()){
            return;
        }
        else if(st.peek() > min){
            st.pop();
        }
        else{
            long old = 2*min - st.peek();
            min = old;
            st.pop();
        }
    }

    public int top() {
        long high = st.peek();
        if(st.isEmpty()){
            return -1;
        }
        else if(st.peek() > min){
            return (int)high;
        }
        else{
            return (int)min;
        }
    }

    public int getMin() {
        return (int)min;
    }
}*/

public class MinStack {
}
