//show yes if the element is present in the array otherwise show no. Here user enter the number of query

package revise_DSA.arrays.Array_Questions;
import java.util.Scanner;
public class SearchElementsBasedOnQuery {
    public static void main(String[] args) {
        int[] arr = {3, 6, 34, 12, 89, 100};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter query no: ");
        int q = sc.nextInt();

        for(int i=1; i<=q; i++){
            System.out.println("Enter query no " + i + " : ");
            int n =  sc.nextInt();
            if(findElement(arr, n)){
                System.out.println("yes");
            }
            else{
                System.out.println("No");
            }
        }
    }

    private static boolean findElement(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}

//Another method is to create a frequency array and search into it
