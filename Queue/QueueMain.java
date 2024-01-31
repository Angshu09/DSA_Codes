package revise_DSA.Queue;

public class QueueMain {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(4);
        queue.insert(45);
        queue.insert(78);
        queue.insert(90);
        queue.insert(23);

        queue.display();

        System.out.println(queue.delete());
        queue.display();
//        System.out.println(queue.firstItem());

        System.out.println(queue.delete());
        System.out.println(queue.delete());
        System.out.println(queue.delete());
//        System.out.println(queue.delete());

        // Circular Queue
        CircularQueue cirQue  = new CircularQueue(5);
        cirQue.insert(34);
        cirQue.insert(4);
        cirQue.insert(45);
        cirQue.insert(94);
        cirQue.insert(31);

        cirQue.display();

        cirQue.delete();

        cirQue.insert(78);

        System.out.println( cirQue.firstItem());

        cirQue.display();
    }
}
