// 💡 3. Queue Scratch Implementation using Linked List:

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Queue implementation using Linked List
class LinkedListQueue {
    Node front; // Points to front (head) of the queue
    Node rear;  // Points to rear (tail) of the queue

    // Constructor
    LinkedListQueue() {
        front = null;
        rear = null;
    }

    // 📍 Check if the queue is empty
    public boolean isEmpty() {
        return front == null && rear == null;
    }

    // 📍 Enqueue: Add element at rear
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // 📍 Dequeue: Remove element from front
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int value = front.data;
        front = front.next;

        if (front == null) {
            // If queue becomes empty after dequeue
            rear = null;
        }

        return value;
    }

    // 📍 Peek: View the front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    // 📍 Print the entire queue
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

// Main class to test the queue
public class _3_Queue {
    public static void main(String[] args) {
        LinkedListQueue q = new LinkedListQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.printQueue(); // Output: Queue: 10 20 30

        System.out.println("Peek: " + q.peek()); // Output: 10

        System.out.println("Dequeued: " + q.dequeue()); // Output: 10
        q.printQueue(); // Output: Queue: 20 30

        q.enqueue(40);
        q.printQueue(); // Output: Queue: 20 30 40

        while (!q.isEmpty()) {
            System.out.println("Dequeued: " + q.dequeue());
        }

        q.printQueue(); // Output: Queue is empty
    }
}

