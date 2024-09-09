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
## Task

Write a method `rotateList` that takes a doubly linked list of type `Node` and a positive integer `N` as parameters. This method should rotate the linked list in an anticlockwise direction by `N` nodes and return the resulting list.

### Example Output

**Input 1:** `Null<-->[a]<-->[b]<-->[c]<-->[d]<-->[e]<-->Null` | `N: 2`

**Output 1:** `Null<-->[c]<-->[d]<-->[e]<-->[a]<-->[b]<-->Null`

**Input 2:** `Null<-->[a]<-->[b]<-->[c]<-->[d]<-->[e]<-->Null` | `N: 4`

**Output 2:** `Null<-->[e]<-->[a]<-->[b]<-->[c]<-->[d]<-->Null`

**Input 3:** `Null<-->[a]<-->[b]<-->[c]<-->[d]<-->[e]<-->Null` | `N: 6`

**Output 3:** `Null<-->[b]<-->[c]<-->[d]<-->[e]<-->[a]<-->Null`
