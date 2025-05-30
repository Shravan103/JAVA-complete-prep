// 📍 Stack Implementation using ArrayList
import java.util.ArrayList;

// Stack class using ArrayList
class StackArrayList {
    private final ArrayList<Integer> stack = new ArrayList<>();

    // 📍 Push element to the stack
    public void push(int data) {
        stack.add(data);
    }

    // 📍 Pop element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return stack.remove(stack.size() - 1);
    }

    // 📍 Peek top element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack.get(stack.size() - 1);
    }

    // 📍 Check if stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // 📍 Get stack size
    public int size() {
        return stack.size();
    }

    // 📍 Print stack
    public void printStack() {
        System.out.println("Stack: " + stack);
    }
}

// Main class to test stack
public class _2_Stacks {
    public static void main(String[] args) {
        StackArrayList stack = new StackArrayList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack();  // Stack: [10, 20, 30]

        System.out.println("Top element is: " + stack.peek());  // 30

        System.out.println("Popped element: " + stack.pop());   // 30
        stack.printStack();  // Stack: [10, 20]

        System.out.println("Stack size: " + stack.size());      // 2

        System.out.println("Is stack empty? " + stack.isEmpty()); // false
    }
}
