package revise_DSA.MathProblems;

import java.util.Arrays;

public class XORQueriesOfASubArray {

    public static void main(String[] args) {
        int[] arr = {1,3,4,8};
        int[][] query = {
                {0,1},
                {1,2},
                {0,3},
                {3,3}
        };
        int[] result = xorQueries(arr, query);
        System.out.println(Arrays.toString(result));
    }

     public static int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefixArray = new int[arr.length];
        prefixArray[0] = arr[0];

        for(int i=1; i<arr.length; i++){
            prefixArray[i] = prefixArray[i-1] ^ arr[i];
        }

        int[] result = new int[queries.length];

        for(int i=0; i<queries.length; i++){
            int l = queries[i][0];
            int r = queries[i][1];
            if(l==0){
                result[i] = prefixArray[r];
            }
            else{
                result[i] = prefixArray[r] ^ prefixArray[l-1];
            }
        }
        return result;
    }
}
