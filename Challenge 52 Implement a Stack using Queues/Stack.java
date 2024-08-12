import java.util.LinkedList;
import java.util.Queue;

public class Stack {
    private Queue<Integer> queue;

    // Constructor to initialize the queue
    public Stack() {
        queue = new LinkedList<>();
    }

    // Method to push an element onto the stack
    public void push(int x) {
        int size = queue.size();
        queue.add(x); // Add the new element to the queue

        // Move all previous elements behind the new element to simulate stack behavior
        for (int i = 0; i < size; i++) {
            queue.add(queue.remove());
        }
    }

    // Method to remove and return the top element from the stack
    public int pop() {
        if (queue.isEmpty()) {
            return -1; // Return -1 if the stack is empty
        }
        return queue.remove(); // Remove and return the top element
    }

    // Method to get the top element of the stack without removing it
    public int top() {
        if (queue.isEmpty()) {
            return -1; // Return -1 if the stack is empty
        }
        return queue.peek(); // Return the top element
    }

    // Method to get the current size of the stack
    public int size() {
        return queue.size();
    }

    // Main method to test the Stack implementation
    public static void main(String[] args) {
        Stack stack = new Stack();
        
        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display the top element
        System.out.println("Top element: " + stack.top()); // Should print 30

        // Pop an element from the stack
        System.out.println("Popped element: " + stack.pop()); // Should print 30

        // Display the size of the stack
        System.out.println("Stack size: " + stack.size()); // Should print 2

        // Display the top element again
        System.out.println("Top element: " + stack.top()); // Should print 20
    }
}
