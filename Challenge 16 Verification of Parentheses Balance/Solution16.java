import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Solution16 {
    // Method to check if two characters are matching parentheses
    public static boolean parenthesesCorrespondantes(char c1, char c2) {
        if (c1 == '(' && c2 == ')') {
            return true;
        } else if (c1 == '{' && c2 == '}') {
            return true;
        } else if (c1 == '[' && c2 == ']') {
            return true;
        }
        return false;
    }
   
    // Method to check if the parentheses in an expression are balanced
    public static boolean estEquilibreParentheses(String expression) throws IllegalArgumentException {
        if (expression == null || expression.isEmpty()) {
            throw new IllegalArgumentException("The expression cannot be empty.");
        }

        // Map to store matching parentheses pairs
        Map<Character, Character> parenthesesMap = new HashMap<>();
        parenthesesMap.put('(', ')');
        parenthesesMap.put('{', '}');
        parenthesesMap.put('[', ']');

        // Stack to keep track of opening parentheses
        Deque<Character> stack = new ArrayDeque<>();

        // Iterate through each character in the expression
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            // If it's an opening parenthesis, push it onto the stack
            if (parenthesesMap.containsKey(c)) {
                stack.push(c);
            // If it's a closing parenthesis, check for matching opening parenthesis
            } else if (parenthesesMap.containsValue(c)) {
                if (stack.isEmpty() || parenthesesMap.get(stack.pop()) != c) {
                    return false;
                }
            }
        }

        // If the stack is empty, all parentheses were matched; otherwise, return false
        return stack.isEmpty();
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        String expression1 = "{[()]}";
        String expression2 = "{[(])}";

        // Check and print if the first expression is balanced
        System.out.println("The expression " + expression1 + " is balanced: " + estEquilibreParentheses(expression1));

        // Check and print if the second expression is balanced
        System.out.println("The expression " + expression2 + " is balanced: " + estEquilibreParentheses(expression2));
    }
}
