package revise_DSA.MathProblems;

public class FindTheNoOfSetBits {
    public static void main(String[] args) {
        int n = 15;
        int count = 0;
        System.out.println(Integer.toBinaryString(n));
//        while(n>0){
//            if(((n&1)==1)){
//                count++;
//            }
//            n = n>>1;
//        }


//        while(n>0){
//            count++;
//            n = n - (n&-n);
//        }

        while(n>0){
            count++;
            n = n & (n-1);
        }


        System.out.println(count);
    }
}
