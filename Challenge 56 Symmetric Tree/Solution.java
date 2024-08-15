class Solution {

    // Method to check if the tree is symmetric
    public static Boolean isSymmetric(Node tree) {        
        return isSymmetric(tree, tree);
    }
    
    // Helper method to check symmetry between two nodes
    public static Boolean isSymmetric(Node tree1, Node tree2) {
        
        // If both nodes are null, the tree is symmetric
        if (tree1 == null && tree2 == null) {
            return true;
        }
        
        // If one of the nodes is null (but not both), the tree is not symmetric
        if (tree1 == null || tree2 == null) {
            return false;
        }
        
        // If the values of the nodes do not match, the tree is not symmetric
        if (tree1.data != tree2.data) {
            return false;
        }
        
        // Recursively check for symmetry between left and right subtrees
        return isSymmetric(tree1.left, tree2.right) &&
               isSymmetric(tree1.right, tree2.left);
    }

    // Main method to test the isSymmetric function
    public static void main(String[] args) {
        // Example test case 1: symmetric tree
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(2);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(4);
        root1.right.right = new Node(5);
        
        System.out.println(isSymmetric(root1)); // Output: true

        // Example test case 2: non-symmetric tree
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(2);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
        root2.right.left = new Node(5);
        root2.right.right = new Node(4);
        
        System.out.println(isSymmetric(root2)); // Output: false
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
