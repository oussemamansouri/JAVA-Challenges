import java.util.Stack;

public class Solution {

    // Checks if the parentheses in the given expression are balanced
    public static boolean areParenthesesBalanced(String expression) throws IllegalArgumentException {
        if (expression == null || expression.isEmpty()) {
            throw new IllegalArgumentException("The expression cannot be empty");
        }
        Stack<Character> stack = new Stack<>();

        // Iterate over each character in the expression
        for (char character : expression.toCharArray()) {
            // Push opening parentheses onto the stack
            if (character == '(' || character == '{' || character == '[') {
                stack.push(character);
            } 
            // For closing parentheses, check if they match the top of the stack
            else if (character == ')' || character == '}' || character == ']') {
                if (stack.isEmpty() || !parenthesesMatch(stack.pop(), character)) {
                    return false;
                }
            }
        }

        // If stack is empty, parentheses are balanced
        return stack.isEmpty();
    }

    // Checks if the given pair of parentheses match
    private static boolean parenthesesMatch(char char1, char char2) {
        return (char1 == '(' && char2 == ')') ||
               (char1 == '{' && char2 == '}') ||
               (char1 == '[' && char2 == ']');
    }

    // Evaluates the given mathematical expression
    public static double calculator(String expression) {
        if(!areParenthesesBalanced(expression)){
            throw new IllegalArgumentException("Your expression is not balanced");
        }
        
        // Remove all whitespace from the expression
        expression = expression.replaceAll("\\s+", "");

        Stack<Double> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        // Iterate over each character in the expression
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // If the character is a digit, parse the full number (including decimals)
            if (Character.isDigit(c)) {
                StringBuilder sb = new StringBuilder();
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    sb.append(expression.charAt(i++));
                }
                i--;  // Step back to adjust for the loop increment
                operands.push(Double.parseDouble(sb.toString()));
            } 
            // Push opening parentheses onto the operators stack
            else if (c == '(') {
                operators.push(c);
            } 
            // Evaluate the expression inside the parentheses
            else if (c == ')') {
                while (operators.peek() != '(') {
                    operands.push(performOperation(operands.pop(), operands.pop(), operators.pop()));
                }
                operators.pop();  // Remove the '(' from the stack
            } 
            // Handle operators and ensure correct precedence
            else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!operators.isEmpty() && hasPrecedence(c, operators.peek())) {
                    operands.push(performOperation(operands.pop(), operands.pop(), operators.pop()));
                }
                operators.push(c);
            }
        }

        // Apply remaining operators to the operands
        while (!operators.isEmpty()) {
            operands.push(performOperation(operands.pop(), operands.pop(), operators.pop()));
        }

        return operands.pop();  // Final result
    }

    // Checks if the first operator has precedence over the second operator
    private static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
            return false;
        }
        return true;
    }

    // Performs the operation based on the given operator
    private static double performOperation(double a, double b, char op) {
        switch (op) {
            case '+':
                return b + a;
            case '-':
                return b - a;
            case '*':
                return b * a;
            case '/':
                if (a == 0) {
                    throw new ArithmeticException("Division by zero!");
                }
                return b / a;
            default:
                return 0;  // Default case should not be reached
        }
    }

    // Main method to test the calculator
    public static void main(String[] args) {
        String expression = "((3 + 4) * 2 - 5 / 2)";
        double result = calculator(expression);
        System.out.println("Result of the expression '" + expression + "' : " + result);
    }
}
