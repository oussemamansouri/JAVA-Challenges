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
