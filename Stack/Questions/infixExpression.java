package revise_DSA.Stack.Questions;

import java.util.Stack;

public class infixExpression {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        System.out.println(calculateInfix(str));
        System.out.println(calculateInfixWithBracket(str));
    }

    private static int calculateInfixWithBracket(String str) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        int val1, val2;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if((int)ch >= 48 && (int)ch <=57){
                val.push((int)ch - 48);
            }
            else if(op.isEmpty() || ch == '(' || op.peek() == '('){
                op.push(ch);
            }
            else if(ch == ')'){
                while(op.peek() != '('){
                    val2 = val.pop();
                    val1 = val.pop();
                    if(op.peek() == '+') val.push(val1 + val2);
                    if(op.peek() == '-') val.push(val1 - val2);
                    if(op.peek() == '*') val.push(val1 * val2);
                    if(op.peek() == '/') val.push(val1 / val2);
                    op.pop();
                }
                op.pop(); //Removing '(
            }
            else{
                if(ch == '+' || ch == '-'){
                    val2 = val.pop();
                    val1 = val.pop();
                    if(op.peek() == '+') val.push(val1 + val2);
                    if(op.peek() == '-') val.push(val1 - val2);
                    if(op.peek() == '*') val.push(val1 * val2);
                    if(op.peek() == '/') val.push(val1 / val2);
                    op.pop();
                    op.push(ch);
                }
                if(ch == '*' || ch == '/'){
                    if(op.peek() == '*' || op.peek() == '/'){
                        val2 = val.pop();
                        val1 = val.pop();
                        if(op.peek() == '*') val.push(val1 * val2);
                        if(op.peek() == '/') val.push(val1 / val2);
                        op.pop();
                        op.push(ch);
                    }
                    else{
                        op.push(ch);
                    }
                }
            }
        }

        while(val.size() > 1){
            val2 = val.pop();
            val1 = val.pop();
            if(op.peek() == '+') val.push(val1 + val2);
            if(op.peek() == '-') val.push(val1 - val2);
            if(op.peek() == '*') val.push(val1 * val2);
            if(op.peek() == '/') val.push(val1 / val2);
            op.pop();
        }

        return val.peek();
    }

    private static int calculateInfix(String str) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        int val1, val2;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if((int)ch >= 48 && (int)ch <=57){
                val.push((int)ch - 48);
            }
            else if(op.isEmpty()){
                op.push(ch);
            }
            else{
                if(ch == '+' || ch == '-'){
                    val2 = val.pop();
                    val1 = val.pop();
                    if(op.peek() == '+') val.push(val1 + val2);
                    if(op.peek() == '-') val.push(val1 - val2);
                    if(op.peek() == '*') val.push(val1 * val2);
                    if(op.peek() == '/') val.push(val1 / val2);
                    op.pop();
                    op.push(ch);
                }
                if(ch == '*' || ch == '/'){
                    if(op.peek() == '*' || op.peek() == '/'){
                        val2 = val.pop();
                        val1 = val.pop();
                        if(op.peek() == '*') val.push(val1 * val2);
                        if(op.peek() == '/') val.push(val1 / val2);
                        op.pop();
                        op.push(ch);
                    }
                    else{
                        op.push(ch);
                    }
                }
            }
        }

        while(val.size() > 1){
            val2 = val.pop();
            val1 = val.pop();
            if(op.peek() == '+') val.push(val1 + val2);
            if(op.peek() == '-') val.push(val1 - val2);
            if(op.peek() == '*') val.push(val1 * val2);
            if(op.peek() == '/') val.push(val1 / val2);
            op.pop();
        }

        return val.peek();
    }
}
