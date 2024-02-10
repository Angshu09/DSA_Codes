package revise_DSA.Recursion;

public class Array_is_Sorted_or_Not {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(checkSorted(arr));
    }

    static boolean checkSorted(int[] arr){

        return helper(arr, 0);
    }

    static boolean helper(int[] arr, int start){
        if(start == arr.length-1){
            return true;
        }

        return arr[start] < arr[start+1] && helper(arr, start+1);
    }
}
