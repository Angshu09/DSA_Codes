package revise_DSA.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL a = new LL();
        a.insertEnd(34);
        a.insertEnd(88);
        a.insertEnd(23);
        a.insertEnd(67);

        a.insertFirst(12);
        a.insertFirst(90);


        a.insertAtIndex(78, 4);

        a.display();
        System.out.println(a.deleteLast());
        a.display();
        a.deleteLast();
        a.display();
        a.deleteLast();
        a.display();
        a.deleteFirst();
        a.display();
        a.insertEnd(78);
        a.insertEnd(34);
        a.display();
        a.deleteIndex(3);
        a.display();
        a.deleteIndex(2);
        a.display();





//        System.out.println(a.length);
    }
}
