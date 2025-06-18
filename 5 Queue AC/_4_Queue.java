// 💡 4. Queue Implementation using Collections Framework:

import java.util.LinkedList;
import java.util.Queue;

public class _4_Queue {
    public static void main(String[] args) {
        // Declare a queue using LinkedList. WHY?
        // Queue is an interface and LinkedList is a class that implements the Queue interface.
        // Objects can be made only on classes, not interfaces.
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements
        queue.add(10); // or queue.offer(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue after enqueues: " + queue); // [10, 20, 30]

        // Peek: Get front element without removing
        System.out.println("Peek: " + queue.peek()); // 10

        // Dequeue elements
        System.out.println("Dequeued: " + queue.remove()); // 10 // or queue.poll();
        System.out.println("Dequeued: " + queue.remove()); // 20

        // Print the queue
        System.out.println("Queue after dequeues: " + queue); // [30]

        // Check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty()); // false

        // Clear the queue
        queue.clear();
        System.out.println("Is queue empty after clear? " + queue.isEmpty()); // true
    }
}

