package revise_DSA.Heap;
//Implementing a Heap
import java.util.ArrayList;

public class Heap <T extends Comparable<T>> {
    private ArrayList<T> list; //Creating a variable list of type arraylist

    public Heap() { //Constructor
        list = new ArrayList<>(); //Whenever an object is created an array list is created as well and the type of the array list is T
    }

    private void swap(int first, int second){ //we are creating this function for swaps in the heap, to maintain the order
        T temp = list.get(first); //get() ---> Returns the element at the specified index in the ArrayList
        list.set(first, list.get(second)); //set() ---> Replaces the element at the specified index with the specified element and returns the old element.
        list.set(second, temp);
    }

    private int parent(int index){
        return (index-1)/2; //it actually returns the parent of any node. Here the index is started from 0 that's why we write index - 1 to  specifically finding the parent
    }

    private int left(int index){
        return (index * 2) + 1; //+1 because again indexing is starting from 0
    }

    private int right(int index){
        return (index*2) + 2; //+2 because again indexing is starting from 0
    }

    public void insert(T val){
        list.add(val); //It adds the val at the last of the arraylist
        upHeap(list.size() - 1); //calling the function by the last value of the arraylist
    }

    private void upHeap(int index){ //This method is used for inserting an element to the heap
        if(index == 0){
            return;
        }

        int p = parent(index);
        if(list.get(index).compareTo(list.get(p)) < 0){ //here .compareTo Method is returning negative if the index value is less than it's parent
            swap(index, p);
            upHeap(p); //Recursion
        }
    }

    public T remove() throws Exception{
        if(list.isEmpty()){ //Here we throw an exception if the user try to remove items from an empty heap
            throw new Exception("Removing from an Empty Heap!!!");
        }

        T temp = list.get(0); //get the first item

        T last = list.remove(list.size() - 1); //here the .remove method removes the last item of the array list and returned that removed item
        if(!list.isEmpty()){ //if my list is not empty then
            list.set(0, last); //set the last removed item in the 0th position of the list
            downHeap(0); //calling the down heap method to maintain the heap property
        }

        return temp; //after successfully completing the execution of the down heap method here we returned the actual removed item
    }

    private void downHeap(int index){
        int min = index; //assume the 0th item is the minimum
        int left = left(index); //getting the left item
        int right = right(index); //getting the right item

        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0){ //if my size of the left is less than the actual size of the array list and the minimum index item is greater than the left index item in that case update the minimum with left index
            min = left;
        }

        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0){ //also applies same for the right item
            min = right;
        }

        if(min != index){ //if the minimum item is not equals to my index item
            swap(min, index); //then just swap my min item with the index item
            downHeap(min);
        }
    }

    //heapsort
    public ArrayList<T> heapSort() throws Exception{
        ArrayList<T> data = new ArrayList<>();

        while(!list.isEmpty()){
            data.add(this.remove());
        }

        return data;
    }

}

