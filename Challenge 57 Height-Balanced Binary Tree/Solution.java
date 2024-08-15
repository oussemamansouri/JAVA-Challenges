public class Solution {

    // Method to check if the binary tree is height-balanced
    public static boolean isBalanced(Node root) {
        return checkBalance(root) != -1;
    }

    // Helper method to verify the balance of the tree and calculate heights
    private static int checkBalance(Node node) {
        if (node == null) {
            return 0;
        }

        // Check the height and balance of the left subtree
        int leftHeight = checkBalance(node.left);
        if (leftHeight == -1) {
            return -1; // Not balanced
        }

        // Check the height and balance of the right subtree
        int rightHeight = checkBalance(node.right);
        if (rightHeight == -1) {
            return -1; // Not balanced
        }

        // If the difference in heights is greater than 1, the tree is not balanced
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1; // Not balanced
        }

        // Return the height of the current node
        return 1 + Math.max(leftHeight, rightHeight);
    }

    // Main method to test the isBalanced function
    public static void main(String[] args) {
        // Example test case 1: unbalanced tree
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.left.right = new Node(4);
        root1.left.right.right = new Node(5);

        System.out.println(isBalanced(root1)); // Output: false

        // Example test case 2: balanced tree
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(0);
        root2.left.left = new Node(4);
        root2.right.right = new Node(7);
        root2.left.left.left = new Node(5);
        root2.left.left.right = new Node(5);

        System.out.println(isBalanced(root2)); // Output: true
    }
}

// Definition for a binary tree node
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
