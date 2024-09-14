package revise_DSA.Heap;

import java.util.ArrayList;

public class mainFile {
    public static void main(String[] args) throws Exception{
        Heap<Integer> list = new Heap<>();

        list.insert(45);
        list.insert(9);
        list.insert(67);
        list.insert(90);
        list.insert(22);

//        System.out.println(list.remove());
//        System.out.println(list.remove());
//        System.out.println(list.remove());

        ArrayList data = list.heapSort();
        System.out.println(data);
    }
}
