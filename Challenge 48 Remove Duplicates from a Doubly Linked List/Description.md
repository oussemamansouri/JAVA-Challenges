# Remove Duplicates from a Doubly Linked List

We started by defining a class for the nodes of the list.

```java
class Node {
    int data;
    Node next;
    Node prev;
    
    Node(int d) {
        data = d;
        next = prev = null;
    }
}
```
Write a `removeDuplicates` function without a return value that takes a doubly linked list of type `Node` as a parameter and removes all duplicate nodes from the list.

**Example Output:**

If the linked list is `11->20->11->21->43->43->43->60`.

Then it should convert the list to `11->20->21->43->60`.
