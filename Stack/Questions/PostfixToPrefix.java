package revise_DSA.Stack.Questions;

import java.util.Stack;

public class PostfixToPrefix {
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
                st.push(ch + val1 + val2);
            }
        }

        System.out.println(st.peek());
    }
}
