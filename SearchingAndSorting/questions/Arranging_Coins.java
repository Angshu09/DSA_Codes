//https://leetcode.com/problems/arranging-coins/

package revise_DSA.SearchingAndSorting.questions;

public class Arranging_Coins {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(arrangeCoins(n));
    }

    public static int arrangeCoins(int n) {
        long start = 0;
        long end = n;

        while(start<=end){
            long mid = start + (end - start) / 2;

            if((mid * (mid + 1)) / 2 == n){
                return (int)mid;
            }

            if((mid * (mid + 1)) / 2 <= n){
                start = mid + 1;
            }

            if((mid * (mid + 1)) / 2 >= n){
                end = mid -1;
            }
        }

        return (int)end;
    }
}
