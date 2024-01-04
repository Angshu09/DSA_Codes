//Find the first repeating number in an array

package revise_DSA.arrays.Array_Questions;

public class FindTheFirstRepeatingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 6, 2, 7,  9, 3};
        System.out.println(findRepeatingNo(arr));
    }

    private static int findRepeatingNo(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
