## Rotate a Doubly Linked List by N Nodes

We started by defining a class for the nodes in the list.

### Class Definition

```java
public class Node {
    char data;
    Node next;
    Node previous;
    
    Node(char d) {
        data = d;
        next = previous = null;
    }
}
```