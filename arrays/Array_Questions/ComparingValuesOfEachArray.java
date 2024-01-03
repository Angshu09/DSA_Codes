//a and b are good friends and they have their skills in the form of array index value. They competing with each other where-
//if a[i] > b[i] then score of a will be increasing by 1
//if a[i] < b[i] then score of b will be increasing by 1
//if a[i] == b[i] then score of a and b will remain same

package revise_DSA.arrays.Array_Questions;

import java.util.Arrays;

public class ComparingValuesOfEachArray {
    public static void main(String[] args) {
        int[] a = {2, 5, 10};
        int[] b = {9, 8, 7};
        System.out.println(Arrays.toString(checkTheScore(a, b)));
    }

    private static int[] checkTheScore(int[] a, int[] b){
        int scoreA=0, scoreB=0;
        for(int i=0; i<3; i++){
            if(a[i]>b[i]){
                scoreA++;
            }
            else if(a[i]<b[i]){
                scoreB++;
            }
        }
        return new int[]{scoreA, scoreB};
    }
}
