package revise_DSA.BigIntegerAndBigDecimal;

import java.math.BigInteger;

public class BigIntegerClass {
    public static void main(String[] args) {
        int a = 4; //This is an int declaration

        BigInteger b = BigInteger.valueOf(5); //Convert int/long to BI
        int c = b.intValue(); //Convert BI into int

        BigInteger d = new BigInteger("23456789912345");

        //Constants
        BigInteger e = BigInteger.TEN;

        //Addition
        BigInteger f = d.add(b); //we can also use .subtract .multiply .divide .remainder
        System.out.println(b.compareTo(d));

        if(d.compareTo(b) < 0){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }

        System.out.println(f);


    }
}
