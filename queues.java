import java.util.LinkedList;
import java.util.Queue;

class queueex {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue: " + queue);

        // Peeking front element
        System.out.println("Front element: " + queue.peek());

        // Removing elements
        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue after removal: " + queue);

        // Checking if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
