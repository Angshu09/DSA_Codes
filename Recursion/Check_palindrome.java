package revise_DSA.Recursion;

public class Check_palindrome {
    public static void main(String[] args) {
        int n = 12321;
        System.out.println(checkPalindrome(n));

        int n1 = 3443;
        System.out.println(checkPalindrome2(n1));
    }

    static boolean checkPalindrome(int n){
        int ori = n;
        int digits = (int)(Math.log10(n)) + 1;
        int num =  helper(n, digits);
        if(ori == num){
            return true;
        }
        return false;
    }

    static int helper(int n, int digits){
        if(n%10 == n){
            return n;
        }

        int last = n%10;

        return (last * (int)(Math.pow(10, digits-1))) + helper(n/10, digits - 1);
    }

    static boolean checkPalindrome2(int n){
        String str = Integer.toString(n);
        return helper2(str, 0, str.length()-1);
    }

    static boolean helper2(String str, int start, int end){

            if(start >= end){
                return true;
            }

           if(str.charAt(start) == str.charAt(end)){
               return helper2(str, start+1, end-1);
           }
           else {
               return false;
           }
    }
}
