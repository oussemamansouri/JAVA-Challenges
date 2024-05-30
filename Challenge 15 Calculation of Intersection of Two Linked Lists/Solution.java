import java.util.HashSet;

// Define the Node class to represent an element of a linked list
public class Solution {

    // Method to find the intersection of two linked lists
    public static Node intersectionLinkedLists(Node l1, Node l2) {
        // Use a set to store the values of the first list
        HashSet<Integer> set = new HashSet<>();
        // Initialize a dummy node for the resulting list
        Node result = new Node(0);
        Node temp = result;
        // Add values from the first list to the set
        while (l1 != null) {
            set.add(l1.value);
            l1 = l1.next;
        }
        // Traverse the second list
        while (l2 != null) {
            // If the value is in the set, add it to the resulting list
            if (set.contains(l2.value)) {
                temp.next = new Node(l2.value);
                temp = temp.next;
            }
            l2 = l2.next;
        }
        // Return the resulting list (excluding the initial dummy node)
        return result.next;
    }

    // Method to display a linked list
    public static String displayList(Node head) {
        StringBuilder res = new StringBuilder();
        while (head != null) {
            res.append(head.value).append(" -> ");
            head = head.next;
        }
        res.append("null");
        return res.toString();
    }

    public static void main(String[] args) {
        // Create two linked lists
        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(3);

        Node list2 = new Node(2);
        list2.next = new Node(3);
        list2.next.next = new Node(4);

        // Display the two lists
        System.out.print("List 1: ");
        System.out.println(displayList(list1));
        
        System.out.print("List 2: ");
        System.out.println(displayList(list2));

        // Find and display the intersection of the two lists
        Node result = intersectionLinkedLists(list1, list2);
        System.out.print("Intersection of lists: ");
        System.out.println(displayList(result));
    }
}

// Node class to represent an element in the linked list
class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}
