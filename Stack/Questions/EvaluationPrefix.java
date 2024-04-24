package revise_DSA.Stack.Questions;

import java.util.Stack;

public class EvaluationPrefix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<Integer> st = new Stack<>();
        int val1, val2;

        // Iterating in default direction
        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);

            if((int)ch >= 48 && (int)ch <=57){
                st.push((int)ch - 48);
            }
            else{
                val1 = st.pop();
                val2 = st.pop();
                if(ch == '+') st.push(val1 + val2);
                if(ch == '-') st.push(val1 - val2);
                if(ch == '*') st.push(val1 * val2);
                if(ch == '/') st.push(val1 / val2);
            }
        }

        System.out.println(st.peek());
    }
}
