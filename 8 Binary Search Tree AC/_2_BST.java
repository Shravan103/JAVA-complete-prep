// 💡 Deletion in Binary Search Tree:

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

    // 📍 Delete a node from the BST : O(H)
    public static Node delete(Node root, int val) {
        if (root == null) return null;

        // Traverse the tree to find the node to delete
        if (val < root.data) {
            root.left = delete(root.left, val);
        }
        else if (val > root.data) {
            root.right = delete(root.right, val);
        }
        else {
            // Node to be deleted found

            // Case 1: No children (leaf node)
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            Node IS = InorderSuccesor(root.right); // Smallest in right subtree
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    // 📍 Find the minimum value node in a subtree
    public static Node InorderSuccesor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}

// Main class
public class _2_BST {
    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int val : values) {
            root = BSTUtils.insert(root, val);
        }

        System.out.print("Inorder Traversal of BST: ");
        BSTUtils.inorder(root);
        System.out.println();

        // 📍 Delete node with value 4 (single child), 5 (two childs)
        root = BSTUtils.delete(root, 4);
        System.out.print("After deleting 3: ");
        BSTUtils.inorder(root);
    }
}
