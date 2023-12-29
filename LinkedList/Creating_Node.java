package revise_DSA.LinkedList;

public class Creating_Node {

    public static class Node{
        int data;
        Node next = null;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(45);
        Node b = new Node(78);
        Node c = new Node(23);
        Node d = new Node(90);
        a.next = b;
        b.next = c;
        c.next = d;

        Node temp = a;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
