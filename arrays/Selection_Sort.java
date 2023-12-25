package revise_DSA.arrays;
import java.util.Scanner;
public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter 6 array elements: ");

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        selection(arr);

        for(int a: arr){
            System.out.print( a + " ");
        }
    }

    static void selection(int[] arr){
        for(int i=0; i<arr.length; i++){
            int last = arr.length - i - 1;
            int max = findMax(arr, 0, last);
            swap(arr, max , last);
        }
    }

    static int findMax(int[] arr, int first, int last){
        int max = first;
        for(int i=1; i<=last; i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int max, int last){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }
}
