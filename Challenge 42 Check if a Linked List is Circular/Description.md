# Challenge 42: Check if a Linked List is Circular

We started by defining a class for the nodes of the list.

```java
public class Noeud {
    int donnee;
    Noeud suivant;

    public Noeud(int donnee) {
        this.donnee = donnee;
        this.suivant = null;
    }
}
```
Write a method named `isCircular` that takes a singly linked list of type `Noeud` as a parameter and returns `true` if it is circular, otherwise `false`.

A linked list is called circular if all the nodes are connected in the form of a cycle.

Here is an example of a circular linked list:
`./Example of a circular linked list.png`


