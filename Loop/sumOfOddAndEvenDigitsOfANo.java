//Write a program to input an integer 'n' and print the sum of all its even digits and the sum of all its odd digits separately.
//Digits mean numbers, not places! That is, if the given integer is "132456", even digits are 2, 4, and 6, and odd digits are 1, 3, and 5.
//Input: 'n' = 132456
//Output: 12 9
//Explanation:
//The sum of even digits = 2 + 4 + 6 = 12
//The sum of odd digits = 1 + 3 + 5 = 9

package revise_DSA.Loop;
import java.util.Scanner;
public class sumOfOddAndEvenDigitsOfANo {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int a: sumOfOddEven(n)){
            System.out.print(a + " ");
        }
    }

    private static int[] sumOfOddEven(int n){
        int no;
        int even=0, odd=0;
        while(n>0){
            no = n%10;
            n = n/10;
            if(no%2==0){
                even = even + no;
            }
            else{
                odd = odd + no;
            }
        }
        return new int[]{even, odd};
    }
}
