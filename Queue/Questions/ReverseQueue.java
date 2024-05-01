package revise_DSA.Queue.Questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q);
        reverseQueue(q);
        System.out.println(q);


//        System.out.println(q);
//        removeKElements(q, 3);
//        System.out.println(q);
    }

    private static void removeKElements(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<k; i++){
            st.push(q.remove());
        }

        while(!st.isEmpty()){
            q.add(st.pop());
        }

        for(int j=0; j<q.size()-k; j++){
            q.add(q.remove());
        }
    }

    private static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()){
            st.push(q.remove());
        }

        while(!st.isEmpty()){
            q.add(st.pop());
        }
    }
}
