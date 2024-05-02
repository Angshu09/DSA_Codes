// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

package revise_DSA.SearchingAndSorting;

import java.util.ArrayList;

public class CyclicSortProblem {

    public ArrayList<Integer> findDisappearedNumbers(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct = arr[i] -1;
            if(arr[correct] != arr[i]){
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }

       ArrayList<Integer> list = new ArrayList<>();

        for(int j=0; j<arr.length; j++){
            if(arr[j] != j+1){
                list.add(j+1);
            }
        }

        return list;
    }

}
