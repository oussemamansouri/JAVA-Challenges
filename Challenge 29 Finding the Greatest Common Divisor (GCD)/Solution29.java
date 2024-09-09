public class Solution29 {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 18;

        try {
            // Calculate the GCD of num1 and num2
            int gcd = calculateGCD(num1, num2);
            System.out.print("The GCD of " + num1 + " and " + num2 + " is " + gcd);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid arguments: " + e.getMessage());
        }
    }

    /**
     * This method calculates the greatest common divisor (GCD) of two positive integers.
     *
     * @param num1 The first positive integer.
     * @param num2 The second positive integer.
     * @return The GCD of the two integers.
     * @throws IllegalArgumentException if either num1 or num2 is not a positive integer.
     */
    public static int calculateGCD(int num1, int num2) {
        if (num1 <= 0 || num2 <= 0) {
            throw new IllegalArgumentException("Arguments must be positive integers");
        }

        // Use the Euclidean algorithm to find the GCD
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        return num1;
    }
}
