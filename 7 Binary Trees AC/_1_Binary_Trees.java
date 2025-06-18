// 💡 Build a Tree from its Preorder traversal

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

class BinaryTree {
    // idx is used to keep track of the current index in the array during tree construction
    // It is static so that it retains its value across recursive calls
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
}

public class _1_Binary_Trees {

    public static void main(String args[]) {
        // Example input: Preorder traversal of a binary tree
        // -1 indicates a null node
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
    }
}
