package revise_DSA.Strings;

public class Check_the_string_is_palindrome_or_not {
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        str = str.toLowerCase();

        if(str.length() == 0){
            return true;
        }

        int start = 0;
        int end = str.length() - 1;

        while(start<=end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
}
