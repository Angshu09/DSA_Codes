package revise_DSA.Stack.Questions;

import java.util.Arrays;
import java.util.Stack;

public class SlidingWindowMaximum {

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println(Arrays.toString(maxSlidingWindow(arr, 3)));
    }

    private static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int z = 0;
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        int[] ans = new int[n-k+1];

        nge[n-1] = n;
        st.push(n-1);

        // Finding the next greater element
        for(int i=n-2; i>=0; i--){
            while(st.size() > 0 && nums[i] > nums[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()) nge[i] = n;
            else nge[i] = st.peek();
            st.push(i);
        }

        int j = 0;
        for(int i=0; i<n-k+1; i++){
            if(j>=i+k){
                j = i;
            }
            int max = nums[i];

            while(j<i+k){
                max = nums[j];
                j = nge[j];
            }

            ans[z++] = max;
        }

        return ans;
    }
}
