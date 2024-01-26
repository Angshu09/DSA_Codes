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
    }
}
