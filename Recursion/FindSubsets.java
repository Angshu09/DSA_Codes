package revise_DSA.Recursion;

public class FindSubsets {
    public static void main(String[] args) {
        String str = "abc";
        find("", str);
    }

    static void find(String ans, String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        find(ans+str.charAt(0), str.substring(1));
        find(ans, str.substring(1));
    }
}
