# Checking for the Presence of an Element in a Linked List

Write a method named `searchElement` that takes a linked list of type `Node` and an integer as parameters. The method checks if the searched value is present in the linked list and returns its position if present only once, -1 if the value is not present, or the number of occurrences preceded by a negative sign otherwise.

The `Node` type is defined as follows:
```java
public class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}
```java
### Example Output:

List: { 10, 20, 30, 40, 20 }

- Input: 25  
  Output: -1

- Input: 30  
  Output: 2

- Input: 20  
  Output: -2
