package revise_DSA.arrays;
import java.util.Scanner;
public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter 6 array elements: ");

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        bubble(arr);

        for(int a: arr){
            System.out.print(a + " ");
        }
    }

    static void bubble(int[] arr){
        for(int i=0; i<arr.length; i++){
            boolean swapped = false;
            for(int j=1; j<arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

}
