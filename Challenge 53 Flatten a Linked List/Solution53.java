class Solution53 {

    // Method to flatten a multi-level linked list
    public static Node flattenList(Node head) {
        Node outer = head;  // Pointer to traverse the outer list
        Node inner = head;  // Pointer to traverse and connect the child list

        while (outer != null) {
            if (outer.child != null) {
                // Traverse to the end of the current list
                while (inner.next != null) {
                    inner = inner.next;
                }

                // Attach the child list at the end of the current list
                inner.next = outer.child;
                outer.child = null; // Set the child pointer to null as it's now connected
            }
            outer = outer.next; // Move to the next node in the outer list
            inner = outer; // Reset the inner pointer to the current node in the outer list
        }

        return head;
    }

    // Main method to test the flattenList method
    public static void main(String[] args) {
        // Creating a multi-level linked list as shown in the example
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(12);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(11);

        head.child = new Node(4);
        head.child.next = new Node(20);
        head.child.next.next = new Node(13);
        head.child.next.next.next = new Node(17);
        head.child.next.next.next.next = new Node(6);

        head.child.child = new Node(2);
        head.child.next.child = new Node(16);
        head.child.next.next.child = new Node(9);
        head.child.next.next.next.child = new Node(8);

        head.child.child.child = new Node(3);
        head.child.next.child.child = new Node(19);
        head.child.next.next.child.child = new Node(15);

        // Flattening the list
        head = flattenList(head);

        // Printing the flattened list
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null"); // To indicate the end of the list
    }
}

// Node class definition
class Node {
    int data;
    Node next;
    Node child;

    // Constructor to initialize the node with data
    Node(int d) {
        data = d;
        next = child = null;
    }
}
