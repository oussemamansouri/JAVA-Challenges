# Array to Balanced Binary Search Tree

We started by defining a class for the nodes of the binary tree.
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
A Binary Search Tree (BST) is a specific type of binary tree where the left node has a value less than the root node's value, and the right node has a value greater than the root node's value.

Write a method named `arrayToBST` that takes a sorted array of integers as input and creates and returns a balanced binary search tree of type `Node`.

## Example Output:

**Input:**
{1, 2, 3, 4, 5, 6, 7}

**Output:**
      4 
   2     6 
 1   3 5   7  
