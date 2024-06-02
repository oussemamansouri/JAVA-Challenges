import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Solution {
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
   
    public static boolean estEquilibreParentheses(String expression) throws IllegalArgumentException {
        if (expression == null || expression.isEmpty()) {
            throw new IllegalArgumentException("L'expression ne peut pas être vide.");
        }

        Map<Character, Character> parenthesesMap = new HashMap<>();
        parenthesesMap.put('(', ')');
        parenthesesMap.put('{', '}');
        parenthesesMap.put('[', ']');

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (parenthesesMap.containsKey(c)) {
                stack.push(c);
            } else if (parenthesesMap.containsValue(c)) {
                if (stack.isEmpty() || parenthesesMap.get(stack.pop()) != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}