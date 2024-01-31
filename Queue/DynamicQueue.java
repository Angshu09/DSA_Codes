package revise_DSA.Queue;

public class DynamicQueue extends CircularQueue{

    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int item) {
        if(this.isFull()){

            int[] temp = new int[this.data.length * 2];

            for(int i=0; i<data.length; i++){
                temp[i] = data[(start+i) % data.length];
            }

            start = 0;
            end = data.length;
            data = temp;
        }

        return super.insert(item);
    }
}
