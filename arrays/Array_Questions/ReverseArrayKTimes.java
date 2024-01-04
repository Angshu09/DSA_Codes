//Reverse an array k times

package revise_DSA.arrays.Array_Questions;

import java.util.Arrays;

public class ReverseArrayKTimes {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 1, 4};
        int k = 1;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverseKTimes(arr, k)));
        reverseKTimes2(arr, k);
        System.out.println(Arrays.toString(arr));
    }


    //using space
    private static int[] reverseKTimes(int[] arr, int n){
        int[] ans = new int[arr.length];
        int k = n% arr.length;
        int j= 0;
         for(int i=arr.length-k; i<arr.length; i++){
             ans[j++] = arr[i];
         }

         for(int i=0; i<arr.length-k; i++){
             ans[j++] = arr[i];
         }
         return ans;
    }


    //Not using extra space

    private static void reverseKTimes2(int[] arr, int n){
        int k = n%arr.length;
        reverseArray(arr, arr.length-k, arr.length-1);
        reverseArray(arr, 0, arr.length-k-1);
        reverseArray(arr, 0, arr.length-1);
    }

    private static void reverseArray(int[] arr, int start, int end) {
        while(start<end){
            swapArray(arr, start, end);
            start ++;
            end --;
        }
    }

    private static void swapArray(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
