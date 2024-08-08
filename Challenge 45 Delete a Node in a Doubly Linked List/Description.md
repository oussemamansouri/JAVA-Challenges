# Delete a Node in a Doubly Linked List

We start by defining a class for the nodes in the list.

```java
class Node {
    int data;
    Node next;
    Node previous;
    Node(int d){
        data = d;
        next = previous = null;
    }
}
```
Write a method named `deleteNode` that takes a doubly linked list of type `Node` as a parameter along with the index of the node to be deleted. The method should delete the node and return the list without that node.

### Example Output

- **Input:** `([10, 8, 4, 2, 1], 2)`  
  **Output:** `[10, 8, 2, 1]`

- **Input:** `([10, 8, 4, 2, 1], 4)`  
  **Output:** `[10, 8, 4, 2]`