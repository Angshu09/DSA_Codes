package revise_DSA.arrays;

public class Linear_search_in_array {
    public static void main(String[] args) {

        //Linear Search in a array that a no is present in the array or not
//        int[] arr= {23, 56, 7,8 , 12, 21};
//        int target = 21;
//
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==target){
//                System.out.println(i);
//                break;
//            }
//        }


        //Linear Search in a string that a character is present or not
//        String s = "Angshu";
//        char target2 = 'g';
//
//        for(char i: s.toCharArray()){
//            if(i==target2){
//                System.out.println("true");
//                break;
//            }
//        }


        //Linear search in a 2d array
        int[][] arr2 = {
                {2, 3, 4, 5},
                {6, 7, 8, 9},
                {10, 11, 12}
        };

        int target = 8;

        for(int i = 0; i<arr2.length; i++){
            for(int j = 0; j<arr2[i].length; j++){
                if(arr2[i][j] == target){
                    System.out.println(i + ", " + j);
                    break;
                }
            }
        }
    }
}
