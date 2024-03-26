package revise_DSA.Stack.Questions;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 8, 6, 3, 4};
        int[] res = nextGreater(arr);
        System.out.println(Arrays.toString(res));

        /* for(int i=0; i<arr.length; i++){
            boolean avail = false;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] > arr[i]){
                    res[i] = arr[j];
                    avail = true;
                    break;
                }
            }
            if(!avail){
                res[i] = -1;
            }
        }
        System.out.println(Arrays.toString(res)); */

    }

    static int[] nextGreater(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        res[n-1] = -1;
        st.push(arr[n-1]);

        for(int i=n-2; i>=0; i--){
            while(st.peek() < arr[i] && st.size() > 0){
                st.pop();
            }
            if(st.size() == 0){
                res[i] = -1;
            }
            else{
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }

        return res;
    }
}
