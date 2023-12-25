package revise_DSA.arrays;
import java.util.Scanner;
public class swap_two_array_elements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            int a = arr.length-i;
            System.out.println("You can add " + a + " elements:");
            arr[i]=sc.nextInt();
        }

        System.out.println("Your array- ");
        for(int a: arr){
            System.out.print(a + " ");
        }

        System.out.println();

        System.out.println("Enter the index no's that you want to swap: ");
        int a = sc.nextInt();
        int b= sc.nextInt();

        swapArray(arr, a, b);
    }

    static void swapArray(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        System.out.println("After swapping the array is: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
