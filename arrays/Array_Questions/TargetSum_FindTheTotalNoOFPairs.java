//Find the total number of pairs in the array whose sum is equal to the given value
//brute force solution
package revise_DSA.arrays.Array_Questions;

public class TargetSum_FindTheTotalNoOFPairs {
    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 5, 8, 2};
        int target = 7;
        System.out.println(findThePairs(arr, target));
    }

    private static int findThePairs(int[] arr, int target){
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }
}
