//In an array every number is occurs twice find the unique number that doesn't occur twice
//This works only positive number;
package revise_DSA.arrays.Array_Questions;

public class FindTheUniqueNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 9};
        System.out.println(findUnique(arr));
    }

    private static int findUnique(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = 0;
                }
            }
        }
        for(int k = 0; k<arr.length; k++){
            if(arr[k]>0){
                return arr[k];
            }
        }
        return -1;
    }

}


