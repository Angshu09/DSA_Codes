package revise_DSA.Recursion;

public class Remove_letters {
    public static void main(String[] args) {
        String str = "abadca";
        String ans = "";
        System.out.println(remove(str, 0, ans));

        String str2 = "bcaddac";
        remove2("", str2);

        String str3 = "hgabgava";
        System.out.println(remove3(str3));

        String str4 = "ahapplegfd";
        System.out.println(removeAString(str4));
    }

    static String remove(String str, int start, String ans){
        if(start >= str.length()){
            return ans;
        }
        if(str.charAt(start) != 'a'){
            ans = ans + str.charAt(start);
            return remove(str, start+1, ans);
        }
        else{
            return remove(str, start+1, ans);
        }
    }

    static void remove2(String process, String unProcess){
        if(unProcess.isEmpty()){
            System.out.println(process);
            return;
        }

        if(unProcess.charAt(0) == 'a'){
            remove2(process, unProcess.substring(1));
        }
        else{
            remove2(process + unProcess.charAt(0), unProcess.substring(1));
        }
    }

    static String remove3(String str){
        if(str.isEmpty()){
            return "";
        }

        if(str.charAt(0) == 'a'){
            return remove3(str.substring(1));
        }
        else{
           return str.charAt(0) + remove3(str.substring(1));
        }
    }

    static String removeAString(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return removeAString(str.substring(5));
        }
        else{
            return str.charAt(0) + removeAString(str.substring(1));
        }
    }
}
