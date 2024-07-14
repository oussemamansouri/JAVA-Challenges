public class LinkedList {

    static public class Node {
        int data;
        Node next;
    
        // Constructor for Node class
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    // Constructor with no parameters, initializes an empty list
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Adds a new element at the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
        this.size++;
    }

    // Adds a new element at the end of the list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        this.size++;
    }

    // Removes the element at the beginning of the list
    public void removeFirst() {
        if (this.head != null) {
            this.head = this.head.next;
            this.size--;
        }
    }

    // Removes the element at the end of the list
    public void removeLast() {
        if (this.head != null) {
            if (this.head.next == null) {
                this.head = null;
            } else {
                Node secondLast = this.head;
                while (secondLast.next.next != null) {
                    secondLast = secondLast.next;
                }
                secondLast.next = null;
            }
            this.size--;
        }
    }

    // Removes the first occurrence of a specific element in the list
    public void remove(int data) {
        if (this.head != null) {
            if (this.head.data == data) {
                this.removeFirst();
            } else {
                Node current = this.head;
                while (current.next != null && current.next.data != data) {
                    current = current.next;
                }
                if (current.next != null) {
                    current.next = current.next.next;
                    this.size--;
                }
            }
        }
    }

    // Checks if the list is empty
    public boolean isEmpty() {
        return this.head == null;
    }

    // Returns the number of elements in the list
    public int size() {
        return this.size;
    }

    // Searches for an element in the list and returns its position or -1 if not found
    public int search(int data) {
        Node current = this.head;
        int position = 0;
        while (current != null) {
            if (current.data == data) {
                return position;
            }
            current = current.next;
            position++;
        }
        return -1; 
    }

    // Inserts a new element at a specified position in the list
    public void insert(int data, int position) {
        if (position < 0 || position > this.size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        if (position == 0) {
            this.addFirst(data);
        } else {
            Node newNode = new Node(data);
            Node current = this.head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            this.size++;
        }
    }

    // Returns the element at a specific position without removing it
    public int get(int position) {
        if (position < 0 || position >= this.size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        Node current = this.head;
        for (int i = 0; i < position; i++) {
            current = current.next;
        }
        return current.data;
    }

    // Updates the element at a specified position with new data
    public void update(int data, int position) {
        if (position < 0 || position >= this.size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        Node current = this.head;
        for (int i = 0; i < position; i++) {
            current = current.next;
        }
        current.data = data;
    }

    // Removes the element at a specified position
    public void removeAtPosition(int position) {
        if (position < 0 || position >= this.size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        if (position == 0) {
            this.removeFirst();
        } else {
            Node current = this.head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            this.size--;
        }
    }

    // Main method to demonstrate the LinkedList functionality
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // Adding elements
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);

        // Printing the size of the list
        System.out.println("Size of the list: " + list.size());

        // Searching for an element
        System.out.println("Position of 30: " + list.search(30));

        // Getting an element by position
        System.out.println("Element at position 2: " + list.get(2));

        // Updating an element at a specific position
        list.update(25, 1);
        System.out.println("Updated element at position 1: " + list.get(1));

        // Removing elements
        list.removeFirst();
        list.removeLast();
        list.remove(25);

        // Printing the size of the list after removals
        System.out.println("Size of the list after removals: " + list.size());

        // Checking if the list is empty
        System.out.println("Is the list empty? " + list.isEmpty());
    }
}
