// https://leetcode.com/problems/sqrtx/


package revise_DSA.SearchingAndSorting;

public class Sqrt_Of_x {

    public static int mySqrt(int x) {
        long ans = 0;
        long start = 1;
        long end = x;
        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (mid * mid <= x) {
                ans = mid;
                start = mid + 1;
            } else if (mid * mid > x) {
                end = mid - 1;
            }
        }
        return (int) ans;
    }
}
