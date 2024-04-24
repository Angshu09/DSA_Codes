package revise_DSA.Stack.Questions;

import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> st = new Stack<>();
        String val1, val2;

        // Iterating in default direction
        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);

            if((int)ch >= 48 && (int)ch <=57){
                String s = "" + ch;
                st.push(s);
            }
            else{
                val1 = st.pop();
                val2 = st.pop();
                st.push(val1 + val2 + ch);
            }
        }

        System.out.println(st.peek());
    }
}
