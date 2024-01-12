// https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/

package revise_DSA.arrays.Array_Questions;

public class DetermineWhetherMatrixCanBeObtainedByRotation {

    class Solution {
        public boolean findRotation(int[][] mat, int[][] target) {
            for(int i=0; i<4; i++){
                if(equal(mat, target)){
                    return true;
                }
                rotate(mat);
            }
            return false;
        }

        public boolean equal(int[][] mat, int[][] target){
            for(int i=0; i<mat.length; i++){
                for(int j=0; j<mat[i].length; j++){
                    if(mat[i][j] != target[i][j]){
                        return false;
                    }
                }

            }
            return true;
        }

        public void rotate(int[][] mat){

            for(int i=0; i<mat.length; i++){
                for(int j=0; j<i; j++){
                    int temp = mat[i][j];
                    mat[i][j]= mat[j][i];
                    mat[j][i] = temp;
                }
            }

            for(int i=0; i<mat.length; i++){
                reverse(mat[i]);
            }
        }

        public void reverse(int[] arr){
            int start = 0;
            int end = arr.length - 1;

            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start ++;
                end --;
            }
        }
    }

}
