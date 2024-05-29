package revise_DSA.StringBuffer;

import java.text.DecimalFormat;
import java.util.Random;

public class SB {
    public static void main(String[] args) {
        String randomString = stringGenerator(20);
        System.out.println(randomString);

        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println(df.format(7.896));
    }

    private static String stringGenerator(int size){
        if(size == 0){
            return "";
        }

        StringBuffer sb = new StringBuffer();
        Random random = new Random();

        for(int i=0; i<size; i++){
            int randomChar = 97 + (int)(random.nextFloat() * 26);
            sb.append((char)randomChar);
        }

        return sb.toString();
    }
}
