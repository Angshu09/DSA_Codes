package revise_DSA.Stack;

import java.util.ArrayList;
import java.util.Stack;

class LVPBruteForce { //This is the brute force solution
     int maxLength(String s){
        // code here
        Stack<Integer> stack = new Stack<>();
        remove(s, stack);

        if(stack.isEmpty()){
            return s.length();
        }

        ArrayList<Integer> list = new ArrayList<>();
        invalid(list, stack, s);

        int max = 0;
        for(int i=1; i<list.size();i++){
            int prev = list.get(i-1);
            max = Math.max(max, list.get(i)-prev-1);
        }

        return max;
    }

    void remove(String str, Stack<Integer> stack){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '('){
                stack.push(i);

            }
            else{
                if(stack.isEmpty() || str.charAt(stack.peek())==')'){
                    stack.push(i);
                }
                else{
                    stack.pop();
                }
            }
        }
    }

     void invalid(ArrayList<Integer> list, Stack<Integer> stack, String s){
        list.add(0, s.length());

        while(!stack.isEmpty()){
            list.add(0, stack.pop());
        }

        list.add(0, -1);
    }
}

class LVPOptimised { //This is the optimised solution
    int maxLength(String s){
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                stack.push(i);
            }
            else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    max = Math.max(max, i - stack.peek());
                }
            }
        }

        return max;
    }
}

public class LongestValidParentheses {
    public static void main(String[] args) {
        String str = ")()())";
        LVPOptimised test = new LVPOptimised();
        System.out.println(test.maxLength(str));
    }
}
