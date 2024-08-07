import java.util.Stack;

class Solution {

    // Method to reverse a doubly linked list using a stack
    static void reverse(Node head) {
        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        
        // Push all node data onto the stack
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        
        temp = head;
        
        // Pop data from the stack and assign it back to the nodes
        while (temp != null) {
            temp.data = stack.pop();
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        
        // Creating a doubly linked list: 1 <-> 2 <-> 3 <-> 4
        node1.next = node2;
        node2.prev = node1;
        node2.next = node3;
        node3.prev = node2;
        node3.next = node4;
        node4.prev = node3;
        
        // Print original list
        System.out.println("Original List:");
        printList(node1);
        
        // Reverse the list
        reverse(node1);
        
        // Print reversed list
        System.out.println("Reversed List:");
        printList(node1);
    }

    // Helper method to print the doubly linked list
    public static void printList(Node node) {
        Node last = null;
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
    }
}

// Definition of the Node class
class Node {
    int data;  // Data held by the node
    Node next;  // Pointer to the next node
    Node prev;  // Pointer to the previous node

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
