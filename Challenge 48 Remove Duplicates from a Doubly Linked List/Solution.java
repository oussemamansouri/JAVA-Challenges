public class Solution {

    // Node class definition
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            data = d;
            next = prev = null;
        }
    }

    // Function to remove duplicates from a doubly linked list
    public static void removeDuplicates(Node list) {
        if (list == null) {
            return; // If the list is empty, nothing to do
        }

        Node current = list;
        while (current != null) {
            Node nextNode = current.next;
            while (nextNode != null) {
                // If the current node's data matches the next node's data
                if (current.data == nextNode.data) {
                    // Adjust the pointers to remove the duplicate node
                    if (nextNode.next != null) {
                        nextNode.next.prev = nextNode.prev;
                    }
                    if (nextNode.prev != null) {
                        nextNode.prev.next = nextNode.next;
                    }
                }
                nextNode = nextNode.next; // Move to the next node
            }
            current = current.next; // Move to the next node in the outer loop
        }
    }

    // Helper function to print the list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating a doubly linked list: 11->20->11->21->43->43->43->60
        Node head = new Node(11);
        head.next = new Node(20);
        head.next.prev = head;
        head.next.next = new Node(11);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(21);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Node(43);
        head.next.next.next.next.prev = head.next.next.next;
        head.next.next.next.next.next = new Node(43);
        head.next.next.next.next.next.prev = head.next.next.next.next;
        head.next.next.next.next.next.next = new Node(43);
        head.next.next.next.next.next.next.prev = head.next.next.next.next.next;
        head.next.next.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next.next.prev = head.next.next.next.next.next.next;

        // Print original list
        System.out.println("Original list:");
        printList(head);

        // Remove duplicates
        removeDuplicates(head);

        // Print list after removing duplicates
        System.out.println("List after removing duplicates:");
        printList(head);
    }
}
