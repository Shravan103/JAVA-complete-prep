// 💡 Print In Range method:

// Node class
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// Utility class for BST operations
class BSTUtils {

    // 📍 Insert a value into the BST : O(H)
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // 📍 Inorder Traversal (for verification)
    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // 📍 Print values in the range [X, Y] : O(H + k)
    public static void printInRange(Node root, int X, int Y) {
        if (root == null) {
            return;
        }

        if (root.data >= X && root.data <= Y) {
            printInRange(root.left, X, Y);
            System.out.print(root.data + " ");
            printInRange(root.right, X, Y);
        }
        else if (root.data < X) {
            printInRange(root.right, X, Y);
        }
        else {
            printInRange(root.left, X, Y);
        }
    }
}

// Main class
public class _3_BST {
    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int val : values) {
            root = BSTUtils.insert(root, val);
        }

        System.out.print("Inorder Traversal of BST: ");
        BSTUtils.inorder(root);
        System.out.println();

        // 📍 Print values in range [3, 6]
        System.out.print("Values in range [3, 6]: ");
        BSTUtils.printInRange(root, 3, 6);
        System.out.println();
    }
}
