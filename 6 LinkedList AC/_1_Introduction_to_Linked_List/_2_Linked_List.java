// 💡 Linked List Implementation in Java using LinkedList library:
import java.util.LinkedList;

public class _2_Linked_List {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // 📍 Add elements to the LinkedList
        list.addFirst("B");
        list.addLast("C");
        list.addFirst("A");
        list.addLast("D");
        // by default, add() adds elements at last
        list.add("Z");  
        // Add "X" at index 2
        list.add(4, "X"); 
        System.out.println("Linked List: " + list);

        // 📍 Remove elements from the LinkedList
        list.removeFirst();
        list.removeLast();
        System.out.println("After removing first and last: " + list);
        // Remove element at index 1
        list.remove(1);
        System.out.println("After removing index 1 element: " + list);

        // 📍 Get the size of the LinkedList
        System.out.println("Size of Linked List: " + list.size());

        // 📍 Traverse LinkedList:
        System.out.print("Traversing Linked List: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");
    }
}
