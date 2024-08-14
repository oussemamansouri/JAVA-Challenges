public class Solution {

    // Method to calculate the maximum depth (height) of a binary tree
    public static int maximumDepth(Node root) {

        // Base case: if the tree is empty, return 0
        if (root == null) {
            return 0;
        } else {
            // Recursive case: calculate the depth of left and right subtrees and add 1 for the current node
            return 1 + Math.max(maximumDepth(root.left), maximumDepth(root.right));
        }
    }

    // Main method to test the maximumDepth method
    public static void main(String[] args) {
        // Create a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Calculate and print the maximum depth of the tree
        System.out.println("Maximum Depth of the tree is: " + maximumDepth(root));  // Output should be 3
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

