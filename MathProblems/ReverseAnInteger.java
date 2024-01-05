//Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
//Example 1:
//Input: x = 123
//Output: 321

//Example 2:
//Input: x = -123
//Output: -321
package revise_DSA.MathProblems;

public class ReverseAnInteger {
    public int reverse(int x) {
        long rev=0, last;
        while(x!=0){
            last = x%10;
            x = x/10;
            rev = (rev*10) + last;
        }

        if(rev > Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
        else if (x<0){
            return (int)(-1 * rev);
        }
        else{
            return (int)rev;
        }

    }
}
