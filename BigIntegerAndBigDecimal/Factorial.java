package revise_DSA.BigIntegerAndBigDecimal;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(100));
    }

    static BigInteger fact(int num){
        if(num == 0){
            return new BigInteger("0");
        }
        BigInteger ans = new BigInteger("1");

        for(int i=2; i<=num; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }

        return ans;
    }
}
