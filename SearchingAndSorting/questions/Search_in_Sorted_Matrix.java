package revise_DSA.SearchingAndSorting.questions;

import java.util.Arrays;

public class Search_in_Sorted_Matrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},               //Sorted matrix means first element of a row is greater than the last element of the previous row
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int target = 15;

        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target){
        int row = arr.length;
        int col = arr[0].length;

        if(row == 1){
            return bs(arr, 0, 0, col-1, target);
        }

        int start = 0;
        int end = arr.length - 1;
        int colMid = end / 2;

        while(start < (end - 1)){
            int mid = start + (end - start) / 2;

            if(arr[mid][colMid] == target){
                return new int[]{mid, colMid};
            }
            else if(arr[mid][colMid] < target){
                start = mid;
            }
            else{
                end = mid;
            }
        }

        //Now we have two rows

        if(arr[start][colMid] == target){
            return new int[]{start, colMid};
        }
        if(arr[start + 1][colMid] == target){
            return new int[]{start+1, colMid};
        }

        //Search in 1st half
        if(target <= arr[start][colMid-1]){
            return bs(arr, start, 0, colMid-1, target);
        }
        //Search in 2nd half
        if(target >= arr[start][colMid+1] && target <= arr[start][col-1]){
            return bs(arr, start, colMid+1, col-1, target);
        }
        //Search in 3rd half
        if(target <= arr[start+1][colMid-1]){
            return bs(arr, start+1, 0, colMid-1, target);
        }
        else{           //search in 4th half
            return bs(arr, start+1, colMid+1, col-1, target);
        }
}

    static int[] bs(int[][] arr, int row, int start, int end, int target){
        while(start<=end){
            int mid = start + (end - start) / 2;

            if(arr[row][mid] == target){
                return new int[]{row, mid};
            }
            else if(arr[row][mid] > target){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }
}
