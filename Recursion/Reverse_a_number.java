package revise_DSA.Recursion;

public class Reverse_a_number {
    public static void main(String[] args) {
        int n = 1234;
//        reverse(n);
//        System.out.println(sum);

        System.out.println(reverse2(n));
    }

    static int sum = 0;

    static void reverse(int n){
        if(n==0){
            return;
        }

        int rev = (n%10);
         sum = (sum * 10) + rev;

         reverse(n/10);
    }

//    static int reverse2(int n){
//        if(n==0){
//            return 0;
//        }
//
//        return ((n%10) * helper(n/10)) + reverse2(n/10);
//    }

//    static int helper(int n){
//        if(n == 0){
//            return 1;
//        }
//        int num = 1;
//        while(n != 0){
//            num = num * 10;
//            n = n/10;
//        }
//        return num;
//    }

    static int reverse2(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits){
        if(n%10 == n){
            return n;
        }

        int last = n%10;

        return (last * (int)(Math.pow(10, digits-1))) + helper(n/10, digits - 1);
    }
}
