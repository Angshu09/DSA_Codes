package revise_DSA.arrays;
import java.util.Scanner;
public class reverse_array_using_swap_method {
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

        int start = 0, end = arr.length-1;
        while(start<end){
            swapArray(arr, start, end);
            start++;
            end--;
        }

        System.out.println("Your reversed array is: ");
        for(int a: arr){
            System.out.print(a + " ");
        }
    }

    static void swapArray(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
