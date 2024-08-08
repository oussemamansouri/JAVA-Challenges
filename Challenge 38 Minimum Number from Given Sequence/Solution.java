import java.util.ArrayList;

public class Solution {

    public static int minSequence(String pattern) {
        int n = pattern.length();
        // Create an array to store the result
        int[] result = new int[n + 1];
        int current = 1;

        // List to handle the reversal of segments
        ArrayList<Integer> stack = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            stack.add(current++);
            // If the end of the pattern is reached or an 'A' is encountered
            if (i == n || pattern.charAt(i) == 'A') {
                // Reverse the stack to satisfy the 'D' pattern
                while (!stack.isEmpty()) {
                    result[i - stack.size() + 1] = stack.remove(stack.size() - 1);
                }
            }
        }

        // Convert the result array to a single integer
        int num = 0;
        for (int digit : result) {
            num = num * 10 + digit;
        }

        return num;
    }

    public static void main(String[] args) {
        // Test the minSequence method
        System.out.println(minSequence("D")); // Output: 21
        System.out.println(minSequence("AADDD")); // Output: 126543
        System.out.println(minSequence("AAAAAAAA")); // Output: 123456789
    }
}
