package revise_DSA.arrays.Array_Questions;

//question link - https://leetcode.com/problems/boats-to-save-people/

import java.util.Arrays;

public class BoatsToSavePeople {

    public static void main(String[] args) {
        int[] people = {3, 2, 2,1};
        System.out.println(numRescueBoats(people, 3));
    }

    private static int numRescueBoats(int[] people, int limit) {
        int count = 0;
        Arrays.sort(people);

        int left = 0;
        int right = people.length -1;

        while(left <= right){
            int sum = people[left] + people[right];

            if(sum <= limit){
                count++;
                left++;
                right--;
            }
            else{
                count++;
                right--;
            }
        }

        return count;
    }
}
