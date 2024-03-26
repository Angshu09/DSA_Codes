package revise_DSA.Stack.Questions;

import java.util.Arrays;
import java.util.Stack;

public class RemoveConsecutiveSubsequences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 7, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2, 8, 8, 8, 9, 1, 0, 0};
        int[] res = remove(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] remove(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n; i++){
            if(st.isEmpty() || st.peek() != arr[i]){
                st.push(arr[i]);
            }
            else{
                if(i == n-1 || arr[i] != arr[i+1]){
                    st.pop();
                }
            }
        }

        int[] res = new int[st.size()];
        for(int j=res.length-1; j>=0; j--){
            res[j] = st.pop();
        }
        return res;
    }
}
