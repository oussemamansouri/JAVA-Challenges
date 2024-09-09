public class Solution41 {
    public static void main(String[] args) {
        // Create nodes
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        // Link nodes
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        // Call the method to find and print the middle node
        System.out.println("The middle element is [" + middleNode(n1) + "]");
    }

    // Method to find the middle node of the linked list
    static int middleNode(Node head) {
        Node fast = head;
        Node slow = head;

        // Move fast pointer by two steps and slow pointer by one step
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // Return the data of the middle node
        return slow.data;
    }
}

// Node class definition
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
