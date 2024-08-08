public class Solution {

    // Function to remove duplicates from a sorted linked list
    public static Node removeDuplicates(Node head) {
        // If the list is empty, throw an exception
        if (head == null) {
            throw new IllegalArgumentException("The list is empty");
        }

        Node current = head;

        // Traverse the list to find and remove duplicates
        while (current != null && current.next != null) {
            // Check if the list is sorted; if not, throw an exception
            if (head.data > head.next.data) {
                throw new IllegalArgumentException("The list is not sorted in ascending order");
            }
            // If the current node and the next node have the same data, skip the next node
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                // Otherwise, move to the next node
                current = current.next;
            }
        }

        // Return the head of the modified list
        return head;
    }

    public static void main(String[] args) {
        Node head = null;

        // Creating a linked list: 11 -> 11 -> 11 -> 21 -> 43 -> 43 -> 60
        head = new Node(11);
        head.next = new Node(11);
        head.next.next = new Node(11);
        head.next.next.next = new Node(21);
        head.next.next.next.next = new Node(43);
        head.next.next.next.next.next = new Node(43);
        head.next.next.next.next.next.next = new Node(60);

        try {
            // Removing duplicates
            head = removeDuplicates(head);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

// Definition of the Node class
class Node {
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
