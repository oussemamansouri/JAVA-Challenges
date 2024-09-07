public class Solution {

    /**
     * Method to count the number of possible combinations of coins to reach a given sum.
     * 
     * @param coins Array of different coin denominations.
     * @param sum The target sum to reach using the coins.
     * @return The number of combinations to reach the target sum.
     */
    public static int count(int[] coins, int sum) {
        // If the sum is 0, there is no need for any coins
        if (sum == 0) {
            return 0;
        }

        // If the sum is negative, it's impossible to form the sum
        if (sum < 0) {
            return 0;
        }

        // Array to store the number of ways to form each sum from 0 to 'sum'
        int[] dp = new int[sum + 1];
        dp[0] = 1; // There is one way to form sum 0, by using no coins

        // Loop over each coin
        for (int coin : coins) {
            // Update the dp array for each sum from 'coin' to 'sum'
            for (int i = coin; i <= sum; i++) {
                dp[i] += dp[i - coin];
            }
        }

        // Return the number of ways to form the target sum
        return dp[sum];
    }

    /**
     * Main method for testing the count method.
     */
    public static void main(String[] args) {
        // Define an array of coin denominations
        int[] coins = {1, 2, 3};

        // Define the target sum
        int sum = 4;

        // Call the count method and print the result
        System.out.println("Number of ways to reach sum " + sum + ": " + count(coins, sum)); // Output: 4
    }
}
