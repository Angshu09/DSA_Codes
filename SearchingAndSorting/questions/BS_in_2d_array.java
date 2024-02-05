package revise_DSA.SearchingAndSorting.questions;

import java.util.Arrays;

public class BS_in_2d_array {
    public static void main(String[] args){
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target = 37;
        System.out.println(Arrays.toString(search(arr, target)));
        System.out.println(Arrays.toString(rowColSortedSearch(arr, target)));
    }

    static int[] rowColSortedSearch(int[][] arr, int target){
        int row = 0;
        int col = arr.length - 1;

        while(row < arr.length && col >= 0){
            if(arr[row][col] == target){
                return new int[]{row, col};
            }
            else if(arr[row][col] < target){
                row++;
            }
            else{
                col--;
            }
        }

        return new int[]{-1, -1};

    }

    static int[] search(int[][] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(BS(arr[i], target) != -1){
                return new int[]{i, BS(arr[i], target)};
            }
        }
        return new int[]{-1, -1};
    }

    static int BS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return -1;
    }
}
