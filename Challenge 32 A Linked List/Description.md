# A Linked List

## Definition of the `Node` Class

```java
public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```
## `LinkedList` Class

### Attributes
- `head` of type `Node`
- `size` of type `int`

### Constructor
- A parameterless constructor.

### Methods

- `addFirst(int data)`: Adds a new element at the beginning of the list.
- `addLast(int data)`: Adds a new element at the end of the list.
- `removeFirst()`: Removes the element at the beginning of the list.
- `removeLast()`: Removes the element at the end of the list.
- `remove(int data)`: Removes the first occurrence of a specific element in the list.
- `isEmpty()`: Checks if the list is empty.
- `size()`: Returns the number of elements in the list.
- `search(int data)`: Searches for an element in the list and returns its position or -1 if not found.
- `insert(int data, int position)`: Inserts a new element at a specified position in the list.
- `get(int position)`: Returns the element at a specific position without removing it.
- `update(int data, int position)`: Updates the element at a specified position with new data.
- `removeAtPosition(int position)`: Removes the element at a specified position.

> The `Node` class is already defined, do not add it!
