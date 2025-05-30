// 📍 Stack Implementation using Collections Framework (stack)
import java.util.Stack;

public class _3_Stacks {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek at the top element
        System.out.println("Top element (peek): " + stack.peek()); // 30

        // Pop elements from the stack
        System.out.println("Popped: " + stack.pop()); // 30
        System.out.println("Popped: " + stack.pop()); // 20

        // Peek again
        System.out.println("Top element after popping: " + stack.peek()); // 10

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // false
    }
}
