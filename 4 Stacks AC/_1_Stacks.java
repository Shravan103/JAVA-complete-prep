// 💡 STACKS implementation using Linked List
// Push, Pop, Peek has O(1) time complexity

// 📍 3 types of stacks implementations:
// 1️⃣ Array based stack (Not a good idea)
//  - If the stack is full, we cannot push any more elements
//  - then we will need to copy the array to a new array with double the size
//  - Therefore its not a good idea to use array based stack

// 2️⃣ ArrayList based stack (in _2_Stacks.java)
// 3️⃣ Linked list based stack (this file)
// 4️⃣ Collections framework based stack (in _3_Stacks.java)

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack class using Linked List
class Stack {
    private Node top;

    // Constructor
    Stack() {
        this.top = null;
    }

    // 🟢 Push operation
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // 🔴 Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    // 🔵 Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return top.data;
    }

    // 🟡 isEmpty check
    public boolean isEmpty() {
        return top == null;
    }

    // 🖨️ Print the stack
    public void printStack() {
        Node current = top;
        System.out.print("Top -> ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

// Main class to test stack
public class _1_Stacks {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack(); // Top -> 30 -> 20 -> 10 -> null

        System.out.println("Peek: " + stack.peek()); // 30
        System.out.println("Popped: " + stack.pop()); // 30
        stack.printStack(); // Top -> 20 -> 10 -> null
    }
}
