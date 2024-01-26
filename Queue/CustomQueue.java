package revise_DSA.Queue;

public class CustomQueue {
    private int[] data;
    int end = 0;

    public CustomQueue(){
        this.data = new int[10];
    }

    public CustomQueue(int n){
       this.data = new int[n];
    }

    public boolean isFull(){
        return end == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int item){
        if(this.isFull()){
            System.out.println("Your queue is full");
            return false;
        }

        data[end++] = item;
        return true;
    }

    public int delete(){
        if(this.isEmpty()){
            System.out.println("Can't delete item from an empty queue");
            return -1;
        }

        int delItem = data[0];

        for(int i=1; i<end; i++){
            data[i-1] = data[i];
        }
        end--;
        return delItem;
    }

    public int firstItem(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }

        return data[0];
    }

    public void display(){
        for(int i=0; i<end; i++){
            System.out.print(data[i] + " <- ");
        }
        System.out.print("END");
        System.out.println();
    }
}
