package revise_DSA.MathProblems;

public class Find_if_it_is_power_of_2_or_not {
    public static void main(String[] args) {
        int n = 16;
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}
