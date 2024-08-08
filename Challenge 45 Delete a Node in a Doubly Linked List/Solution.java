public class Solution {

    // Method to delete a node from a doubly linked list
    public static Node deleteNode(Node head, int index) {
        // If the list is empty, return the head
        if (head == null) {
            return head;
        }

        // Check if the index is valid
        if (index < 0) {
            throw new IllegalArgumentException("Index must be greater than or equal to zero");
        }

        Node current = head;
        int currentIndex = 0;

        // Traverse the list to find the node at the specified index
        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }

        // If the node is not found, throw an exception
        if (current == null) {
            throw new IllegalArgumentException("Index is out of bounds of the list");
        }

        // If the node to be deleted is not the first node
        if (current.previous != null) {
            current.previous.next = current.next;
        } else {
            // If the node to be deleted is the first node, update the head
            head = current.next;
        }

        // If the node to be deleted is not the last node
        if (current.next != null) {
            current.next.previous = current.previous;
        }

        // Return the updated list
        return head;
    }

    public static void main(String[] args) {
        Node head = null;

        try {
            int index1 = 2;
            head = deleteNode(head, index1);
            System.out.print("Output: ");
            printList(head);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to print the elements of the list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// Definition of the Node class
class Node {
    int data;
    Node next;
    Node previous;
    Node(int d){
        data = d;
        next = previous = null;
    }
}