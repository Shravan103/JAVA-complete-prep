// 💡 Diameter of a Tree:
// - Number of nodes in the longest path between any two nodes.

// - 2 cases:
// 1. Diameter through the root node
// 2. Diameter not through the root node
// - Time Complexity: O(n^2) for all
// - Optimized: O(n)

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// Helper class to store height and diameter
class TreeInfo {
    int height;
    int diam;

    TreeInfo(int height, int diam) {
        this.height = height;
        this.diam = diam;
    }
}

class BinaryTree {
    static int idx = -1;

    public Node buildTree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    // 📍 Height of the Tree
    public int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // 📍 Diameter of the Tree : O(n^2)
    public int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int diam1 = height(root.left) + height(root.right) + 1;
        int diam2 = diameter(root.left);
        int diam3 = diameter(root.right);

        return Math.max(diam1, Math.max(diam2, diam3));
    }

    // 📍 Optimized Diameter of the Tree : O(n)
    public TreeInfo diameterOptimized(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo leftTI = diameterOptimized(root.left);
        TreeInfo rightTI = diameterOptimized(root.right);

        int myHeight = Math.max(leftTI.height, rightTI.height) + 1;

        int diam1 = leftTI.height + rightTI.height + 1;
        int diam2 = leftTI.diam;
        int diam3 = rightTI.diam;

        int myDiam = Math.max(diam1, Math.max(diam2, diam3));

        return new TreeInfo(myHeight, myDiam);
    }
}

public class _4_Binary_Trees {
    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);
        System.out.println("Root node: " + root.data);

        // 📍 Diameter of the Tree : O(n^2)
        System.out.println("Diameter of the Tree (O(n^2)): " + tree.diameter(root));

        // 📍 Optimized Diameter of the Tree : O(n)
        TreeInfo ti = tree.diameterOptimized(root);
        System.out.println("Diameter of the Tree (Optimized O(n)): " + ti.diam);
    }
}
