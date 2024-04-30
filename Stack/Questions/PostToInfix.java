package revise_DSA.Stack.Questions;

import java.util.Stack;

public class PostToInfix {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<String> st = new Stack<>();
        String val1, val2;

        // Iterating in default direction
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if((int)ch >= 48 && (int)ch <=57){
                String s = "" + ch;
                st.push(s);
            }
            else{
                val2 = st.pop();
                val1 = st.pop();
                String ans = "(" + val1 + ch + val2 + ")";
                st.push(ans);
            }
        }

        System.out.println(st.peek());
    }
}
