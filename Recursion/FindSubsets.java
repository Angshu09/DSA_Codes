package revise_DSA.Recursion;

import java.util.ArrayList;

public class FindSubsets {
    public static void main(String[] args) {
        String str = "abc";
        find("", str);

        String str2 = "abc";
        System.out.println(findSubSetList("", str2));

        int[] arr = {1, 2, 3};
        System.out.println(subsetSearch(arr));

        int[] arr2 = {1, 2, 2};
        System.out.println(subsetSearchDuplicate(arr2));
    }

    static void find(String ans, String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        find(ans+str.charAt(0), str.substring(1));
        find(ans, str.substring(1));
    }

    static ArrayList<String> findSubSetList(String ans, String str){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch = str.charAt(0);

        ArrayList<String> left = findSubSetList(ans+ch, str.substring(1));
        ArrayList<String> right = findSubSetList(ans, str.substring(1));

        left.addAll(right);
        return left;
    }

    static ArrayList<ArrayList<Integer>> subsetSearch(int[] arr){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num: arr){
            int n = outer.size();
            for(int i=0; i<n; i++){
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

    static ArrayList<ArrayList<Integer>> subsetSearchDuplicate(int[] arr){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for(int i=0; i<arr.length; i++){
            start = 0;
            if(i>0 && arr[i] == arr[i-1]){
                start = end + 1;
            }

            end = outer.size() - 1;
            int n = outer.size();

            for(int j=start; j<n; j++){
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }

        return outer;
    }
}
