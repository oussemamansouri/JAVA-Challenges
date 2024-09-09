# Middle Node of a Linked List

We started by defining a class for the nodes of the list.

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
Write a method named `middleNode` that takes a singly linked list of type `Node` as a parameter and returns the middle of the list. For example, if the given linked list is `1->2->3->4->5`, the output should be `3`. If there is an even number of nodes, there will be two middle nodes, and we should return the second middle element. For example, if the given linked list is `1->2->3->4->5->6`, the output should be `4`.

### Example Output:

6->Null  
The middle element is [6]

5->6->Null  
The middle element is [6]

4->5->6->Null  
The middle element is [5]

3->4->5->6->Null  
The middle element is [5]

2->3->4->5->6->Null  
The middle element is [4]

1->2->3->4->5->6->Null  
The middle element is [4]
