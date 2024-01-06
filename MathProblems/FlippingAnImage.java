//https://leetcode.com/problems/flipping-an-image/
//Flipping an image

package revise_DSA.MathProblems;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row: image){
            for(int i=0; i<(image[0].length + 1)/2; i++){
                int temp = row[i] ^ 1;
                row[i] = row[row.length - 1 - i] ^ 1;
                row[row.length -1 -i] = temp;
            }
        }

        return image;
    }
}
