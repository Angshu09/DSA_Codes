package revise_DSA.arrays;

import java.util.ArrayList;
import java.util.Scanner;
public class arrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Single ArrayList
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(67);
//        list.add(64);
//        list.add(89);
//        System.out.println(list.get(1));

        //2D ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //Initialization
        for(int i=0; i<3; i++){
            list.add(new ArrayList<>());
        }

        //Input
        for(int j=0; j<3; j++){
            for(int l=0; l<3; l++) {
                list.get(j).add(sc.nextInt());
            }
        }

        //printing
        for(int k=0; k<3; k++){
            System.out.println(list.get(k));
        }
    }
}