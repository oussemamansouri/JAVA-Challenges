import java.util.Stack;

public class Solution49 {
    
    // Method to check if the character is an operator
    static boolean isOperator(char operator) {
        switch (operator) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '%':
                return true;
        }
        return false;
    }

    // Method to convert a prefix expression to an infix expression
    public static String convert(String expression) {
        if (expression == null || expression.isEmpty()) {
            throw new IllegalArgumentException("The expression is null or empty.");
        }
        
        Stack<String> stack = new Stack<>();
        int length = expression.length();
        
        // Traverse the expression from right to left
        for (int i = length - 1; i >= 0; i--) {
            char ch = expression.charAt(i);
            
            // If the character is an operator, pop two operands from the stack and form the infix expression
            if (isOperator(ch)) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("The expression is missing operands.");
                }
                String operand1 = stack.pop();
                String operand2 = stack.pop();
                String operation = "(" + operand1 + ch + operand2 + ")";
                stack.push(operation);
            }
            // If the character is a letter (operand), push it onto the stack
            else if (Character.isLetter(ch)) { 
                stack.push(ch + "");
            } 
            // If the character is not a valid letter or operator, throw an exception
            else {
                throw new IllegalArgumentException("Character must be a letter.");
            }
        }
        // The final element in the stack is the complete infix expression
        return stack.pop();
    }

    public static void main(String[] args) {
        String expression = "*-A/FC-/ADL";
        System.out.println("Infix: " + convert(expression));
    }
}
