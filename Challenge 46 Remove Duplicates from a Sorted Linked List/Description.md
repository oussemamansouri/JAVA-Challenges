## Remove Duplicates from a Sorted Linked List

We begin by defining a class for the nodes in the list.

```java
class Node {
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
```
Write a function named `removeDuplicates` that takes a sorted linked list in ascending order and removes all duplicate nodes from the list.

### Example

If the linked list is `11->11->11->21->43->43->60`, it should be converted to `11->21->43->60`.

### Example Output

- **Input:** `[1, 1, 1, 3, 3, 5]`  
  **Output:** `[1, 3, 5]`