// 💡 2. Circular Queue Scratch Implementation using Arrays

class CircularQueue {
    int arr[];
    int size;
    int front;
    int rear;

    // Constructor to initialize the circular queue
    CircularQueue(int n) {
        arr = new int[n];
        size = n;
        front = -1;
        rear = -1;
    }

    // 📍 Check if the queue is empty
    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    // 📍 Check if the queue is full
    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    // 📍 Enqueue: Add an element to the queue
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    // 📍 Dequeue: Remove the front element
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int result = arr[front];
        if (front == rear) {
            // Only one element was present
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return result;
    }

    // 📍 Peek: View the front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    // 📍 Display the queue
    public void printQueue() {
    if (isEmpty()) {
        System.out.println("Queue is empty");
        return;
    }

    System.out.print("Queue elements: ");
    int i = front;
    while (true) {
        System.out.print(arr[i] + " ");
        if (i == rear) break;
        i = (i + 1) % size;
    }
    System.out.println();
}
}



public class _2_Queue {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50); // This will be rejected because queue is full (4+1)%5 = 0 == front ⁂ Queue full
        q.printQueue(); // Display the queue

        System.out.println("Peek: " + q.peek()); // 10

        System.out.println("Dequeued: " + q.dequeue()); // 10
        System.out.println("Dequeued: " + q.dequeue()); // 20

        q.enqueue(60);
        q.enqueue(70); // These will be placed in the emptied slots

        while (!q.isEmpty()) {
            System.out.println("Dequeued: " + q.dequeue());
        }

        System.out.println("Is empty? " + q.isEmpty()); // true
    }
}
