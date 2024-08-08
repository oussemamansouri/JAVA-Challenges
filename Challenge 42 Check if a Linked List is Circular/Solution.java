public class Solution {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        
        // Creating a simple linked list: 1 -> 2 -> 3
        n1.next = n2;
        n2.next = n3;
        n3.next = null; 
        
        // Check if the linked list is circular (should be false)
        System.out.println(isCircular(n1)); 
        
        // Making the linked list circular: 1 -> 2 -> 3 -> 1
        n3.next = n1; 
        
        // Check if the linked list is circular (should be true)
        System.out.println(isCircular(n1)); 
    }
    
    // Method to check if a linked list is circular
    public static boolean isCircular(Node head) {
        if (head == null) {
            return false;
        }
        
        Node fast = head;
        Node slow = head;
        
        // Using Floyd’s Cycle-Finding Algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next; // move slow pointer by one
            fast = fast.next.next; // move fast pointer by two
            
            // If slow and fast meet at some point, then there is a loop
            if (slow == fast) {
                return true;
            }
        }
        
        // If we reach here, then there is no loop
        return false;
    }
}

// Definition of the Node class
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
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
