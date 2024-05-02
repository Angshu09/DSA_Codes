package revise_DSA.Queue.Questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReorderQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        System.out.println(q);
        Reorder(q);
        System.out.println(q);
    }

    private static void Reorder(Queue<Integer> q){
        int n = q.size();
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n/2; i++){
            st.push(q.remove());
        }

        while(!st.isEmpty()){
            q.add(st.pop());
        }

        for(int i=0; i<n/2; i++){
            st.push(q.remove());
        }

        while(!st.isEmpty()){
            q.add(st.pop());
            q.add(q.remove());
        }

        while(!q.isEmpty()){
            st.push(q.remove());
        }

        while(!st.isEmpty()){
            q.add(st.pop());
        }
    }
}
