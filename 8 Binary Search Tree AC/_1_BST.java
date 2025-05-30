// 💡 Binary Search Tree Insertion/Building & Searching:

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

    // 📍 Search a value in the BST : O(H)
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (key < root.data) {
            // Search in left subtree
            return search(root.left, key);
        } else if (key > root.data) {
            // Search in right subtree
            return search(root.right, key);
        } else {
            // Key is equal to root's data
            return true;
        }
    }

    // 📍 Inorder Traversal (for verification)
    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

// Main class
public class _1_BST {
    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int val : values) {
            root = BSTUtils.insert(root, val);
        }

        System.out.print("Inorder Traversal of BST: ");
        BSTUtils.inorder(root);
        System.out.println();

        // 📍 Test BST Search
        int key = 4;
        System.out.println("Is " + key + " present in BST? " + BSTUtils.search(root, key));
    }
}
