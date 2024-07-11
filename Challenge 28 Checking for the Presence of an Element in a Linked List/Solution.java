public class Solution {
    
    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    /**
     * This method searches for an element in a linked list.
     *
     * @param head The head node of the linked list.
     * @param value The value to search for.
     * @return The position of the value if present only once,
     *         -1 if the value is not present,
     *         or the negative count of occurrences if present more than once.
     */
    public static int searchElement(Node head, int value) {
        if (head == null) {
            throw new IllegalArgumentException("Null list!!");
        }

        Node current = head;
        int position = -1;
        int index = 0;
        int occurrence = 0;

        // Traverse the linked list
        while (current != null) {
            if (current.value == value) {
                position = index;
                occurrence++;
            }
            current = current.next;
            index++;
        }

        // If the value occurs more than once, return the negative count of occurrences
        if (occurrence > 1) {
            return occurrence * -1;
        }

        return position;
    }

    public static void main(String[] args) {
        // Example usage
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(20);

        System.out.println("Input: 25\nOutput: " + searchElement(head, 25));
        System.out.println("Input: 30\nOutput: " + searchElement(head, 30));
        System.out.println("Input: 20\nOutput: " + searchElement(head, 20));
    }
}
