import java.util.Stack;

public class Solution {
    
    // Method to reverse a string using a stack
    public static String reverse(String str) {
        Stack<Character> stack = new Stack<>();
        
        // Push each character of the string onto the stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        
        StringBuilder result = new StringBuilder();
        
        // Pop each character from the stack and append it to the result
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        
        // Convert the StringBuilder to a String and return it
        return result.toString();
    }

    public static void main(String[] args) {
        String reversedString = reverse("formation");
        System.out.println(reversedString); // Output: noitamrof
    }
}
