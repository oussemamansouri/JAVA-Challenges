## Determine if Two Given Trees are Identical

We start by defining a class for the nodes of the binary tree.
```java
class Node {
    int data;
    Node left;
    Node right;

    // Constructor to initialize a node with a given value
    Node(int item) {
        data = item;
        left = right = null;
    }
}
```
Write a method named `areTreesIdentical` that takes two trees of type `Node` as parameters and returns `true` if they are identical, otherwise `false`.

Two trees are considered identical when they have the same data and the arrangement of the data is also the same.
