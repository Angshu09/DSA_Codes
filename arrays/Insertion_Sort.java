package revise_DSA.arrays;
import java.util.Scanner;
public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter 6 array elements: ");

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        insertion(arr);

        for(int a: arr){
            System.out.print(a + " ");
        }
    }

    static void insertion(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }

}
