package revise_DSA.Stack.Questions;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String str = "()((()))";
        System.out.println(isBalanced(str));

        String str2 = ")(";
        System.out.println(minCount(str2));
    }

    static boolean isBalanced(String str){

        Stack<Character> st = new Stack<>();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '('){
                st.push(str.charAt(i));
            }
            else{
                if(st.size() == 0){
                    return false;
                }
                if(st.peek() == '('){
                    st.pop();
                }
            }
        }

        if(st.size() > 0){
            return false;
        }
        else{
            return true;
        }
    }

    static int minCount(String str){
        Stack<Character> st = new Stack<>();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '('){
                st.push(str.charAt(i));
            }
            else{
               if(st.isEmpty()){
                   st.push(str.charAt(i));
               }
               else if(st.peek() == '('){
                    st.pop();
               }
               else{
                   st.push(str.charAt(i));
               }
            }
        }

        if(st.size() > 0){
            return st.size();
        }
        else{
            return -1;
        }
    }
}
