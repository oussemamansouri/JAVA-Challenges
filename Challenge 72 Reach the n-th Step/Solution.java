public class Solution {

    /**
     * Method to find the number of ways to reach the n-th step.
     * 
     * @param n The total number of steps in the staircase.
     * @return The number of possible ways the child can reach the n-th step.
     */
    public static int findSteps(int n) {
        // If there is 1 or fewer steps, there is only 1 way to climb
        if (n <= 1) {
            return 1;
        }

        // Array to store the number of ways to reach each step
        int[] ways = new int[n + 1];

        // There is exactly 1 way to reach step 0 (by doing nothing)
        ways[0] = 1;

        // Iterate through each step from 1 to n
        for (int i = 1; i <= n; i++) {
            // Calculate the number of ways to reach the i-th step
            ways[i] = ways[i - 1] + (i >= 2 ? ways[i - 2] : 0) + (i >= 3 ? ways[i - 3] : 0);
        }

        // Return the number of ways to reach the n-th step
        return ways[n];
    }

    /**
     * Main method to test the findSteps method.
     */
    public static void main(String[] args) {
        // Test case 1: 3 steps
        int n1 = 3;
        System.out.println("Number of ways to reach step " + n1 + ": " + findSteps(n1)); // Output: 4

        // Test case 2: 4 steps
        int n2 = 4;
        System.out.println("Number of ways to reach step " + n2 + ": " + findSteps(n2)); // Output: 7
    }
}
