package revise_DSA.MathProblems;

public class FindAllThePrimeNumbersLessThanN {
    public static void main(String[] args) {
        int n = 40;
        boolean[] arr = new boolean[n+1];
        printPrimes(n, arr);
    }

    static void printPrimes(int n, boolean[] arr){
        if(n<=1){
            System.out.println(-1);
        }

        for(int i=2; i*i <= n; i++){
            if(!arr[i]){
                for(int j=i*2; j<=n; j=j+i){
                    arr[j] = true;
                }
            }
        }

        for(int i=2; i<=n; i++){
            if(!arr[i]){
                System.out.println(i+ " ");
            }
        }
    }


}
