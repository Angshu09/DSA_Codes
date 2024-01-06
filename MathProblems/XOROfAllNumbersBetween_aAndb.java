package revise_DSA.MathProblems;

public class XOROfAllNumbersBetween_aAndb {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        int result = xor(b) ^ xor(a-1); //it gives me xor between 3^4^5^6^7^8^9
        System.out.println(result);
    }

    private static int xor(int n){
        if(n%4==0){
            return 0;
        }

        if(n%4 == 1){
            return 1;
        }

        if(n%4 == 2){
            return n+1;
        }

        return 0;
    }

}
