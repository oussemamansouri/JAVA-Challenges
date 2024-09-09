public class Solution47 {

    // Method to rotate a doubly linked list by N nodes in an anticlockwise
    // direction
    static Node rotateList(Node head, int n) {
        // Throw an exception if the position is invalid (negative)
        if (n < 0) {
            throw new IllegalArgumentException("Invalid position!");
        }
        // If the list is empty or n is 0, return the original head
        if (head == null || n == 0) {
            return head;
        }

        // Calculate the size of the list
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }

        // Reduce n to a manageable size if it is greater than the list size
        n = n % size;
        if (n == 0) {
            return head;
        }

        // Traverse the list to find the node at the nth position
        current = head;
        int count = 1;
        while (count < n && current != null) {
            current = current.next;
            count++;
        }

        // Set up the new head and the new tail of the rotated list
        Node newTail = current;
        Node newHead = current.next;

        // If the new head is null, it means we're not rotating the list
        if (newHead == null) {
            return head;
        }

        // Detach the new tail from the rest of the list
        newTail.next = null;
        newHead.previous = null;

        // Find the old tail of the list
        Node oldTail = newHead;
        while (oldTail.next != null) {
            oldTail = oldTail.next;
        }

        // Link the old tail to the old head, completing the rotation
        oldTail.next = head;
        head.previous = oldTail;

        // Return the new head of the list
        return newHead;
    }

    public static void main(String[] args) {
        try {
            // Create the nodes of the list
            Node a = new Node('a');
            Node b = new Node('b');
            Node c = new Node('c');
            Node d = new Node('d');
            Node e = new Node('e');

            // Link the nodes together
            a.next = b;
            b.previous = a;
            b.next = c;
            c.previous = b;
            c.next = d;
            d.previous = c;
            d.next = e;
            e.previous = d;

            // Rotate the list by 2 nodes
            Node newHead = rotateList(a, 2);

            // Print the rotated list
            Node current = newHead;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        } catch (IllegalArgumentException ex) {
            // Handle any errors
            System.out.println("Error: " + ex.getMessage());
        }
    }

    // Definition of the Node class
    public static class Node {
        char data;
        Node next;
        Node previous;

        Node(char d) {
            data = d;
            next = previous = null;
        }
    }
}
