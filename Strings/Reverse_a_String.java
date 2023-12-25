package revise_DSA.Strings;
import java.util.Scanner;

public class Reverse_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = sc.nextLine();
        System.out.println(reverseString(str));


        //Formatted String example
        //String name = "Alice";
        //int age = 30;
        //String formattedString = String.format("Name: %s, Age: %d", name, age);
        //System.out.println(formattedString);
        //Output - Name: Alice, Age: 30
    }

    static String reverseString(String str){
        StringBuilder sb = new StringBuilder(str);

        int start = 0;
        int end = sb.length()-1;

        while(start<=end){
            char first = sb.charAt(start);
            char last = sb.charAt(end);

            sb.setCharAt(start, last);
            sb.setCharAt(end, first);

            start++;
            end--;
        }

        return sb.toString();
    }
}
