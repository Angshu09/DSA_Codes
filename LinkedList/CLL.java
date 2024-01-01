package revise_DSA.LinkedList;

public class CLL {
    Node head;
    Node tail;

    public CLL(){
        this.head = null;
        this.tail=null;
    }
    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insert(int val){
        Node node = new Node(val);
        if(head==null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node temp = head;
        if(head!=null){
            do{
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }while(temp!=head);
        }
        System.out.println("HEAD");
    }

    public void delete(int val){
        Node temp = head;

        if(temp==null){
            return;
        }

        if(temp.val == val){
            head = head.next;
            tail.next = head;
            return;
        }

        boolean check = false;
        while(temp.next!=head){
            if(temp.next.val == val){
                check = true;
                break;
            }
            temp = temp.next;
        }

        if(check==false){
            System.out.println("Doesn't found");
        }

        temp.next = temp.next.next;


    }

}
