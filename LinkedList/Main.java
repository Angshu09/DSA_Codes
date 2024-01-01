package revise_DSA.LinkedList;

import revise_DSA.CLL;

public class Main {
    public static void main(String[] args) {

        //Singly linked list
//        LL a = new LL();
//        a.insertEnd(34);
//        a.insertEnd(88);
//        a.insertEnd(23);
//        a.insertEnd(67);
//
//        a.insertFirst(12);
//        a.insertFirst(90);
//
//
//        a.insertAtIndex(78, 4);
//
//        a.display();
//        System.out.println(a.deleteLast());
//        a.display();
//        a.deleteLast();
//        a.display();
//        a.deleteLast();
//        a.display();
//        a.deleteFirst();
//        a.display();
//        a.insertEnd(78);
//        a.insertEnd(34);
//        a.display();
//        a.deleteIndex(3);
//        a.display();
//        a.deleteIndex(2);
//        a.display();
//        System.out.println(a.length);



        //Doubly linked list
//        DLL b = new DLL();
//        b.insertFirst(34);
//        b.insertFirst(89);
//
//        b.insertLast(67);
//        b.insertLast(12);

//        b.insertAfterNode(56, 34);
//        b.insertAfterNode(7, 12);



//        b.display();
//        b.displayInReverse();
//
//        b.deleteBeforeNode(12);
//        b.display();



        //Circular Linked list
        CLL c = new CLL();
        c.insert(3);
        c.insert(45);
        c.insert(89);
        c.insert(34);
        c.display();
        c.delete(45);
//        c.delete(3);
//        c.delete(34);
        c.display();

    }
}
