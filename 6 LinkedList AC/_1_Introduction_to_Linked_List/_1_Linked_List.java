// 💡 Linked List SCRATCH Implementation in Java
// Node class - represents a single node
class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class - handles the entire list and tracks size
class LinkedListMethods {
    Node head;
    private int size;

    // Constructor initializes size to 0
    LinkedListMethods() {
        this.size = 0;
    }

    // 📍 Add First:
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // 📍 Add Last:
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // 📍 Print List:
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // 📍 Delete First:
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;
    }

    // 📍 Delete Last:
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        size--;
    }

    // 📍 Get Size:
    public int getSize() {
        return size;
    }
}

// Main class to test the LinkedList
public class _1_Linked_List {
    public static void main(String[] args) {
        LinkedListMethods list = new LinkedListMethods();

        list.addFirst("A");
        list.addFirst("B");
        list.addLast("C");
        list.addFirst("D");
        list.addLast("E");

        list.printList(); // D -> B -> A -> C -> E -> null
        System.out.println("Size: " + list.getSize()); // Size: 5

        list.deleteFirst();
        list.printList(); // B -> A -> C -> E -> null
        System.out.println("Size: " + list.getSize()); // Size: 4

        list.deleteLast();
        list.printList(); // B -> A -> C -> null
        System.out.println("Size: " + list.getSize()); // Size: 3
    }
}
