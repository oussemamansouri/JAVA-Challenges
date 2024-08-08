public class Solution {

    // Function to remove duplicates from a sorted linked list
    public static Node removeDuplicates(Node head) {
        // If the list is empty, return the head
        if (head == null) {
            return head;
        }

        Node current = head;

        // Check if the list is sorted
        Node temp = head;
        while (temp.next != null) {
            if (temp.data > temp.next.data) {
                throw new IllegalArgumentException("The list is not sorted in ascending order");
            }
            temp = temp.next;
        }

        // Traverse the list to find and remove duplicates
        while (current != null && current.next != null) {
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
            // Printing the list after removing duplicates
            printList(head);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
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
