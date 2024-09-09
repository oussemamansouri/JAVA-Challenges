import java.util.Stack;

public class Solution50 {
    
    // Method to reverse the stack using recursion
    public static Stack<Character> reverse(Stack<Character> stack) {
        if (stack.isEmpty() || stack.size() == 1) {
            return stack;
        } else {
            char first = stack.pop(); // Remove the top element
            Stack<Character> reversedStack = reverse(stack); // Recursively reverse the remaining stack
            insertAtBottom(reversedStack, first); // Insert the removed element at the bottom
            return reversedStack;
        }
    }

    // Helper method to insert an element at the bottom of the stack
    private static void insertAtBottom(Stack<Character> stack, char element) {
        if (stack.isEmpty()) {
            stack.push(element); // Base case: if stack is empty, push the element
        } else {
            char first = stack.pop(); // Remove the top element
            insertAtBottom(stack, element); // Recursively insert the element at the bottom
            stack.push(first); // Push the removed element back on top
        }
    }

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');

        System.out.println(stack); // Print original stack
        Stack<Character> reversedStack = reverse(stack); // Reverse the stack
        System.out.println(reversedStack); // Print reversed stack
    }
}
