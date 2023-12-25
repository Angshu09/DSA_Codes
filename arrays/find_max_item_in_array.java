package revise_DSA.arrays;
import java.util.Scanner;
public class find_max_item_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            int a = arr.length-i;
            System.out.println("You can add " + a + " elements:");
            arr[i]=sc.nextInt();
        }
        System.out.println("Your max item in the array is: " + findMax(arr));
    }

    static int findMax(int[] arr){
        int temp = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>temp){
                temp = arr[i];
            }
        }
        return temp;
    }
}
