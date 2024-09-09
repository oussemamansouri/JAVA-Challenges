public class Solution59 {
    
    // Method to check if the binary tree is a Max Heap
    public static boolean isMaxHeap(Node root) {
        // An empty tree is considered a Max Heap
        if (root == null) {
            return true; 
        }

        // Helper method to validate the Max Heap property
        return isMaxHeapHelper(root);
    }

    // Helper method that recursively checks the Max Heap property
    private static boolean isMaxHeapHelper(Node node) {
        // If the node is a leaf node, it satisfies the Max Heap property
        if (node.left == null && node.right == null) {
            return true; 
        }

        // If the current node's value is less than any of its children, it is not a Max Heap
        if ((node.left != null && node.data < node.left.data) ||
            (node.right != null && node.data < node.right.data)) {
            return false; 
        }

        // Recursively check the left and right subtrees
        return isMaxHeapHelper(node.left) && isMaxHeapHelper(node.right);
    }

    // Main method to test the isMaxHeap method
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(6);
        root.right.right = new Node(7);
        root.left.left = new Node(7);
        root.left.left.left = new Node(5);
        root.left.left.right = new Node(4);

        // Output: false
        System.out.println(isMaxHeap(root)); 
        
    }
      
}

class Node {
    int data;
    Node left;
    Node right;

    // Constructor to initialize a node with a given value
    Node(int item) {
        data = item;
        left = right = null;
    }
}
