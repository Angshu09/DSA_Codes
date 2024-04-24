package revise_DSA.Stack.Questions;

import java.util.Stack;

public class PostfixExpression {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6"; //infix, The postfix will be-  953+4*6/-
        System.out.println(convertToPostfix(str));
    }

    private static String convertToPostfix(String str) {
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        String newVal;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <=57){
                //String s = "" + ch;
                String s = String.valueOf(ch);
                val.push(s);
            }
            else if(op.isEmpty() || ch == '(' || op.peek() == '('){
                op.push(ch);
            }
            else if(ch == ')'){
                while(op.peek() != '('){
                    work(val, op);
                }
                op.pop(); //Removing '(
            }
            else{
                if(ch == '+' || ch == '-'){
                    work(val, op);
                    op.push(ch);
                }
                if(ch == '*' || ch == '/'){
                    if(op.peek() == '*' || op.peek() == '/'){
                        work(val, op);
                        op.push(ch);
                    }
                    else{
                        op.push(ch);
                    }
                }
            }
        }

        while(val.size() > 1){
            work(val, op);
        }

        String ans = val.pop();
        return ans;
    }

    private static void work(Stack<String> val, Stack<Character> op) {
        String val1, val2;
        char operator;
        val2 = val.pop();
        val1 = val.pop();
        operator = op.pop();
        val.push(val1 + val2 + operator);
    }
}
