package revise_DSA.LinkedList;

public class LL {

    private Node head;
    private Node tail;
    public int length;

    public LL(){
        this.length = 0;
    }


    public Node getNode(int index){
        Node node = head;
        for(int i=1; i<index; i++){
            node = node.next;
        }
        return node;
    }


    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail==null){
            tail = head;
        }

        length += 1;
    }

    public void insertEnd(int value){
        if(tail == null){
           insertFirst(value);
           return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        length += 1;
    }

    public void insertAtIndex(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == length){
            insertEnd(value);
            return;
        }

        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;

        length += 1;
    }


    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if (head==null){
            tail = null;
        }
        length--;
        return val;
    }


    public int deleteLast(){
        if(length<=1){
            return deleteFirst();
        }

        Node secondLast = getNode(length-1);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        length--;
        return val;
    }


    public int deleteIndex(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index == length-1){
            return deleteLast();
        }

        Node prev = getNode(index);
        int val = prev.next.value;
        prev.next = prev.next.next;
        length--;
        return val;
    }


    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " ---> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }



}
