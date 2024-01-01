package revise_DSA.LinkedList;

public class DLL {

    Node head;

    private class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
        }

        Node (int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.next = prev;
        }
    }


    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        if(head==null){
            insertFirst(val);
            return;
        }

        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node node = new Node(val);
        temp.next = node;
        node.prev = temp;
        node.next = null;
    }

    public void insertAfterNode(int val, int whichVal){
        Node temp = head;
        boolean check = false;
        Node node = new Node(val);
        while(temp!=null){
            if(temp.val == whichVal){
                check = true;
                break;
            }
            temp = temp.next;
        }

        if (check == false) {
            System.out.println("Doesn't found");
            return;
        }

        if(temp.next == null){
            temp.next = node;
            node.prev = temp;
            node.next = null;
            return;
        }

        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
        node.prev = temp;
    }

    public void deleteBeforeNode(int whichVal){
        Node temp = head;
        boolean check = false;
        while(temp!=null){
            if(temp.val==whichVal){
                check = true;
                break;
            }
            temp = temp.next;
        }

        if (check == false) {
            System.out.println("Doesn't exist");
            return;
        }

        if(temp.prev == null){
            System.out.println("Nothing to delete");
            return;
        }

        temp.prev.prev.next = temp;
        temp.prev = temp.prev.prev;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    public void displayInReverse(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp = temp.prev;
        }
        System.out.print("START");
        System.out.println();
    }
}
