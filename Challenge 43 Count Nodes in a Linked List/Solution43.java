public class Solution43 {

    // Method to count the number of nodes in a linked list (circular or not)
    public static int countNodes(Node list) {
        if (list == null) {
            return 0;  // If the list is empty, return 0
        }
        
        int count = 1;  // Initialize count to 1 to include the head node
        Node current = list.next;
        while (current != null && current != list) {
            count++;  // Increment count for each node
            current = current.next;  // Move to the next node
        }
        return count;  // Return the total number of nodes
    }

    public static void main(String[] args) throws Exception {
        Node node1 = new Node(5);
        Node node2 = new Node(5);
        Node node3 = new Node(5);
        Node node4 = new Node(5);
        Node node5 = new Node(4);
        
        // Creating the linked list: 5 -> 5 -> 5 -> 5 -> 4
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        // node5.next = node1;  // Uncomment this line to make the list circular
        
        // Print the number of nodes in the linked list
        System.out.println(countNodes(node1));
    }
}

// Definition of the Node class
class Node {
    int data;  // Data held by the node
    Node next;  // Pointer to the next node

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
