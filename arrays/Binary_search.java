package revise_DSA.arrays;

public class Binary_search {
    public static void main(String[] args) {
        int[] arr = {12, 15, 18, 34, 56, 78, 90, 98};
        int target = 90;
        int index = binarySearch(arr, target);
        System.out.println(index);
    }

    //For ascending ordered array
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start) / 2;

            if(target<arr[mid]){
                end = mid -1;
            }
            else if(target>arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }
}
