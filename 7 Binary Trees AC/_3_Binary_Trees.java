// 💡 Count Number of Nodes in the Tree & Height of the Tree & Sum of Nodes values:
// / Time Complexity: O(n) for all

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

    // 📍 Count of Nodes
    public int countOfNodes(Node root) {
       if(root == null) {
           return 0;
       }


       int leftNodes = countOfNodes(root.left);
       int rightNodes = countOfNodes(root.right);
       return leftNodes + rightNodes + 1;
   }

    // 📍 Height of the Tree
   public int height(Node root) {
       if(root == null) {
           return 0;
       }


       int leftHeight = height(root.left);
       int rightHeight = height(root.right);
       return Math.max(leftHeight, rightHeight) + 1;
   }

    // 📍 Sum of Nodes values
   public int sumOfNodes(Node root) {
       if(root == null) {
           return 0;
       }


       int leftSum = sumOfNodes(root.left);
       int rightSum = sumOfNodes(root.right);
       return leftSum + rightSum + root.data;
   }


}

public class _3_Binary_Trees {

    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        // 📍 Count of Nodes
        int count = tree.countOfNodes(root);
        System.out.println("Count of Nodes: " + count);

        // 📍 Height of the Tree
        int height = tree.height(root);
        System.out.println("Height of the Tree: " + height);

        // 📍 Sum of Nodes values
        int sum = tree.sumOfNodes(root);
        System.out.println("Sum of Nodes values: " + sum);
    }
}

