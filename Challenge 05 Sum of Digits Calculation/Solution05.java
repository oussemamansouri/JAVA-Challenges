public class Solution05 {

    // Main method: entry point of the program
    public static void main(String[] args){

        int n = 546;  // Define an integer n with the value 546
        // Print the sum of the digits of n
        System.out.println("The sum of the digits of " + n + " is: " + sumOfDigits(n));

    }

    // Method to calculate the sum of the digits of an integer n
    public static int sumOfDigits(int n){
        int sum = 0;  // Initialize sum to 0
        // Loop until all digits are processed
        while (n != 0) {
            sum += n % 10;  // Add the last digit of n to sum
            n = n / 10;     // Remove the last digit from n
        }
        return sum;  // Return the calculated sum
    }

}
