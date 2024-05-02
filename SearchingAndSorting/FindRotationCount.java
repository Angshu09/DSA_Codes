package revise_DSA.SearchingAndSorting;
import java.util.Scanner;
public class FindRotationCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<arr.length; i++){
            int ele = sc.nextInt();
            arr[i] = ele;
        }
        System.out.println("Your array is: ");
        for(int a: arr){
            System.out.print(a + " ");
        }
        System.out.println();

        int ans = findRotation(arr);
        System.out.println(ans);
    }

    static int findRotation(int[] arr){
        int ans = findPivot(arr);
        return ans + 1;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }
            else if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start ++;

                if(arr[end] < arr[end - 1]){
                    return end-1;
                }
                end --;
            }
            else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }

        return -1;
    }
}
