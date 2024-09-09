public class Solution58 {

    public static Node arrayToBST(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        return arrayToBSTHelper(array, 0, array.length - 1);
    }

    private static Node arrayToBSTHelper(int[] array, int start, int end) {
        if (start > end) {
            return null;
        }

        // Find the middle element
        int mid = (start + end) / 2;

        // Create a new node with the middle element
        Node root = new Node(array[mid]);

        // Recursively build the left and right subtrees
        root.left = arrayToBSTHelper(array, start, mid - 1);
        root.right = arrayToBSTHelper(array, mid + 1, end);

        return root;
    }

    // Node class definition
    static class Node {
        int data;
        Node left, right;

        // Constructor to initialize a node with a given value
        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        Node root = arrayToBST(array);

        // Print the tree in-order (for demonstration purposes)
        printInOrder(root);
    }

    // Helper method to print the tree in-order
    private static void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.data + " ");
            printInOrder(node.right);
        }
    }
}
