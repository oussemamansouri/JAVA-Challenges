# Calculation of Intersection of Two Linked Lists

Write a method named `intersectionLinkedLists` that takes two linked lists as input and returns a new list representing the intersection of the two original lists.

The `Node` class represents an element of a linked list.

```java
class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}
