package revise_DSA.arrays;
//given an array and my job is to find the numbers that have only even no of digits and count the numbers
public class find_nos_of_nos_that_have_even_no_of_digit {
    public static void main(String[] args) {
        int[] arr = {23, 1, 345, 6789, 123, 34, 89, 12, 6789, 123456};
        System.out.println(noOfEvenCount(arr));
    }

    static int noOfEvenCount(int[] arr){
        int count = 0;
        for(int a: arr){
            if(findEvenOrNot(a)){
                count ++;
            }
        }
        return count;
    }

    static boolean findEvenOrNot(int n){
        if(findNumberCount(n)%2==0){
            return true;
        }
        return false;
    }
    static int findNumberCount(int n){
        int count = 0;
        while(n>0){
            count ++;
            n= n/10;
        }
        return count;
    }
}
