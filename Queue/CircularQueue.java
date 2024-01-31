package revise_DSA.Queue;

public class CircularQueue {
     int[] data;
    int end = 0;
    int start = 0;
    int size = 0;

    public CircularQueue(){
        this.data = new int[10];
    }

    public CircularQueue(int n){
        this.data = new int[n];
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int item){
        if(this.isFull()){
            System.out.println("Your queue is full");
            return false;
        }

        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int delete(){
        if(this.isEmpty()){
            System.out.println("Can't delete item from an empty queue");
            return -1;
        }

        int delItem = data[start++];
        start = start % data.length;
        size--;
        return delItem;
    }

    public int firstItem(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }

        return data[start];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("EMPTY");
            return;
        }

        int i = start;
        do{
            System.out.print(data[i] + " -> ");
            i++;
            i = i % data.length;
        }while(i != end);
        System.out.print("End");
        System.out.println();
    }

}
