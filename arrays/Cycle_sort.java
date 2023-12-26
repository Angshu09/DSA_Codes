package revise_DSA.arrays;
import java.util.Scanner;
public class Cycle_sort {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[6];
            System.out.println("Enter 6 array elements: ");

            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }

           cycle(arr);

            for(int a: arr){
                System.out.print(a + " ");
            }
        }

        static void cycle(int[] arr){
            int i=0;
            while(i<arr.length){
                int correct = arr[i]-1;
                if(arr[i]!=arr[correct]){
                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                }
                else{
                    i++;
                }
            }
        }

}
