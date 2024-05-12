package revise_DSA.SearchingAndSorting;

import java.util.Arrays;

public class KthSmallestPrimeFraction {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println(Arrays.toString(kthSmallestPrimeFraction(arr, 3)));
    }
    public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        double low = arr[0] / (double)arr[n-1];
        double high = 1;

        while(low < high){
            double mid = (low + high) / 2;

            //Count, Num, Deno
            int[] count = helper(arr, mid);

            if(k<count[0]){
                high = mid;
            }
            else if(k>count[0]){
                low = mid;
            }
            else{
                return new int[] {count[1], count[2]};
            }
        }

        return null;
    }

    public static int[] helper(int[] arr, double target){
        int n= arr.length;
        int count = 0;
        int num = arr[0];
        int deno = arr[n-1];
        int i =0;
        for(int j=1; j<n;j++){
            while(arr[i] <= arr[j]*target){
                i++;
            }
            count += i;
            while(i>0 && arr[i-1] * deno > arr[j] * num){
                num = arr[i-1];
                deno = arr[j];
            }
        }

        return new int[] {count, num, deno};
    }
}
