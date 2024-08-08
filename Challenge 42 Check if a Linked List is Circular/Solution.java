public class Solution {

    public static void main(String[] args) {
        // Creating nodes for the linked list
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        
        // Linking the nodes
        n1.next = n2;
        n2.next = n3;
        n3.next = null; 
        
        // Checking if the linked list is circular
        System.out.println(isCircular(n1)); // Expected output: false
        
        // Creating a circular linked list by linking the last node to the first node
        n3.next = n1; 
        
        // Checking if the linked list is circular again
        System.out.println(isCircular(n1)); // Expected output: true
    }
    
    /**
     * Checks if the linked list is circular.
     * 
     * @param head The head node of the linked list.
     * @return true if the linked list is circular, false otherwise.
     */
    public static boolean isCircular(Node head) {
        // If the list is empty, it cannot be circular
        if (head == null) {
            return false;
        }
        
        Node fast = head; // Fast pointer
        Node slow = head; // Slow pointer
        
        // Traverse the list with two pointers
        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow pointer by one step
            fast = fast.next.next; // Move fast pointer by two steps
            
            // If the slow and fast pointers meet, the list is circular
            if (slow == fast) {
                return true;
            }
        }
        
        // If the fast pointer reaches the end, the list is not circular
        return false;
    }

    // Definition of the Node class
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}
