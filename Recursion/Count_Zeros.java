package revise_DSA.Recursion;

public class Count_Zeros {
    public static void main(String[] args) {
        int n = 30204007;
        System.out.println(countZeros(n, 0));
    }

    static int countZeros(int n, int count){
        if(n/10 == 0){
            return count;
        }
        if(n%10 == 0){
            return countZeros(n/10, ++count) ;
        }
        else{
            return countZeros(n/10, count);
        }
    }
}
