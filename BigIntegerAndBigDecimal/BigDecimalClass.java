package revise_DSA.BigIntegerAndBigDecimal;

import java.math.BigDecimal;

public class BigDecimalClass {
    public static void main(String[] args) {
        BD();
    }

    static void BD(){
        double a = 0.03;
        double b = 0.04;
        System.out.println(b-a); //0.010000000000000002

        BigDecimal A = new BigDecimal("0.03");
        BigDecimal B = new BigDecimal("0.04");
        System.out.println(B.subtract(A)); //0.01

        BigDecimal x = new BigDecimal("437898434897.43987495498");
        BigDecimal y = new BigDecimal("8734643694598463.4898897589");

        //Operations
        System.out.println(y.add(x));
        System.out.println(y.multiply(x));
        System.out.println(y.pow(2));
    }
}
