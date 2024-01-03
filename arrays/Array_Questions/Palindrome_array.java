//Check the array is palindrome or not

package revise_DSA.arrays.Array_Questions;

public class Palindrome_array {
    public static void main(String[] args) {
        int[] arr = {1, 2,3,2,3,2,1};
        System.out.println(checkPalindrome(arr));
    }

    private static boolean checkPalindrome(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            if(arr[start] != arr[end]){
                return false;
            }
            start ++;
            end--;
        }
        return true;
    }
}
