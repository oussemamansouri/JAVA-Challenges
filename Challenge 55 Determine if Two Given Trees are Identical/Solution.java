class Solution {
    // Method to determine if two binary trees are identical
    public static boolean areTreesIdentical(Node firstTree, Node secondTree) {
        // First case: both trees are null
        if (firstTree == null && secondTree == null)
            return true;
        // Second case: both trees are non-null, proceed to compare them
        if (firstTree != null && secondTree != null)
            return (firstTree.data == secondTree.data &&
                    areTreesIdentical(firstTree.right, secondTree.right) &&
                    areTreesIdentical(firstTree.left, secondTree.left));
        // Third case: one tree is null and the other is not
        return false;
    }

    // Main method to test the areTreesIdentical method
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.right = new Node(3);
        root1.left = new Node(2);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);

        Node root2 = new Node(1);
        root2.right = new Node(3);
        root2.left = new Node(2);
        root2.left.left = new Node(4);
        root2.left.right = new Node(6);

        // Check if the two trees are identical
        boolean result = areTreesIdentical(root1, root2);
        System.out.println(result); // Output will be false as root1 and root2 are different
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

