// 💡 1. Queue Scratch Implementation using Arrays

class Queue {
    int arr[];
    int size;
    int rear;

    // Constructor to initialize the queue
    Queue(int n) {
        arr = new int[n];
        size = n;
        rear = -1;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return rear == -1;
    }

    // Enqueue: Add an element to the queue
    public void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    // Dequeue: Remove the front element
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int front = arr[0];
        // Shift all elements left
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return front;
    }

    // Peek: View the front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[0];
    }
}


public class _1_Queue {

    // Main method to test the queue
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Peek: " + q.peek()); // 10
        System.out.println("Dequeued: " + q.dequeue()); // 10
        System.out.println("Dequeued: " + q.dequeue()); // 20
        System.out.println("Peek after dequeue: " + q.peek()); // 30
        System.out.println("Is empty? " + q.isEmpty()); // false

        q.dequeue(); // remove 30
        System.out.println("Is empty after all dequeues? " + q.isEmpty()); // true
    }
}
