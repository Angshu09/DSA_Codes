package revise_DSA.Recursion;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
        permutation("", str);
        System.out.println(permutationList("", str));
        System.out.println(permutationCount("", str));
    }

    static void permutation(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unProcessed.charAt(0);
        for(int i=0; i<=processed.length(); i++){
            String left = processed.substring(0, i);
            String right = processed.substring(i, processed.length());
            permutation(left + ch + right, unProcessed.substring(1));
        }
    }

    static ArrayList<String> permutationList(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
           ArrayList<String> ans = new ArrayList<>();
           ans.add(processed);
           return ans;
        }
        char ch = unProcessed.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<=processed.length(); i++){
            String left = processed.substring(0, i);
            String right = processed.substring(i, processed.length());
            ans.addAll(permutationList(left + ch + right, unProcessed.substring(1)));
        }
        return ans;
    }

    static int permutationCount(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
            return 1;
        }
        char ch = unProcessed.charAt(0);
        int count = 0;
        for(int i=0; i<=processed.length(); i++){
            String left = processed.substring(0, i);
            String right = processed.substring(i, processed.length());
            count = count + permutationCount(left + ch + right, unProcessed.substring(1));
        }
        return count;
    }
}
