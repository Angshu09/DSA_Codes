//Find the second largest element in an array

package revise_DSA.arrays.Array_Questions;

public class FindTheSecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 1, 2, 9};
        int ans = findSecLarge(arr);
        System.out.println(ans);
    }

    private static int findSecLarge(int[] arr){
        int max = findMax(arr);
        arr[max] = Integer.MIN_VALUE;
        int ans = findMax(arr);
        return arr[ans];
    }

    private static int findMax(int[] arr){
        int max=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
}
