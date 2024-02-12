package revise_DSA.Recursion;

import java.util.ArrayList;

public class Linear_search_With_Recursion {
    public static void main(String[] args) {
        int[] arr = {2, 7, 3, 2, 6, 1};
//        System.out.println(linearSearch(arr, 6));

//        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println(findAllIndex(arr, 0, 2, list));

        System.out.println(findAllIndex2(arr, 0, 2));
    }

    static int linearSearch(int[] arr, int target){
        return helper(arr, target, 0);
    }

    static int helper(int[] arr, int target, int start){
        if(start >= arr.length){
            return -1;
        }

        if(arr[start] == target){
            return start;
        }
        else{
            return helper(arr, target, start + 1);
        }
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int start, int target, ArrayList<Integer> list){
        if(start == arr.length){
            return list;
        }

        if(arr[start] == target){
            list.add(start);
        }

        return findAllIndex(arr, start + 1, target , list);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int start, int target){
        ArrayList<Integer> list = new ArrayList<>();

        if(start == arr.length){
            return list;
        }

        if(arr[start] == target){
            list.add(start);
        }

        ArrayList<Integer> ansFormBellowCalls = findAllIndex2(arr, start+1, target);

        list.addAll(ansFormBellowCalls);

        return list;
    }
}
