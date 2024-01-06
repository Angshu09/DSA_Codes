//https://leetcode.com/problems/add-to-array-form-of-integer/description/
 // Add to array from of integer

package revise_DSA.arrays.Array_Questions;

import java.util.ArrayList;

public class AddToArrayFromInteger {
    public ArrayList<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i= num.length-1;
        int n= num.length;

        while(i>=0|| k>0){
            if(i>=0){
                ans.add(0, (num[i]+k)%10);
                k = (num[i]+k)/10;
                i--;
            }
            else{
                ans.add(0, k%10);
                k=k/10;
            }
        }
        return ans;
    }
}
