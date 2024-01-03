//given an unsorted array. given a key value. your task is to find the first index and the last index of the key value.
//return the indexes as an array,  where key is first found from left and right.
//if the key does not exist return [-1, -1]

package revise_DSA.arrays.Array_Questions;

import java.util.Arrays;

public class find_the_key_in_array {
    public static void main(String[] args) {
        int key = 2;
        int[] arr = {1, 2,6, 8, 2};
        System.out.println(Arrays.toString(checkOccurence(arr, key)));
    }

    private static int[] checkOccurence(int[] arr, int key) {
        int[] result = {-1, -1};
        int index1, index2;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                result[0] = i;
                break;
            }
        }
        for(int j=arr.length-1; j>=0; j--){
            if(arr[j] == key){
                result[1] = j;
                break;
            }
        }
        return result;
    }


}
