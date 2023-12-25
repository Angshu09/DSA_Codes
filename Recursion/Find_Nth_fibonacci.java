package revise_DSA.Recursion;

public class Find_Nth_fibonacci {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(findNthFib(n));
    }

    static int findNthFib(int n){
        if(n<2){
            return n;
        }

        return findNthFib(n-1) + findNthFib(n-2);
    }
}
