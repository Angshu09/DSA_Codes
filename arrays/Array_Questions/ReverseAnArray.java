//Just reverse an array

package revise_DSA.arrays.Array_Questions;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {2, 7, 1, 9, 4, 5, 1};
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
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
