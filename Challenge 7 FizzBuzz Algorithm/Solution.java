import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a positive integer
        int n = scanner.nextInt();

        // Check if the entered number is non-positive
        if (n <= 0) {
            // If the number is non-positive, display a message
            System.out.print("Please enter a positive integer.");
        } else {
            // If the number is positive, proceed with FizzBuzz logic
            StringBuilder result = new StringBuilder();

            // Iterate from 1 to n
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    // If the number is divisible by both 3 and 5, append "FizzBuzz" to the result
                    result.append("FizzBuzz ");
                } else if (i % 3 == 0) {
                    // If the number is divisible by 3 only, append "Fizz" to the result
                    result.append("Fizz ");
                } else if (i % 5 == 0) {
                    // If the number is divisible by 5 only, append "Buzz" to the result
                    result.append("Buzz ");
                } else {
                    // If the number is neither divisible by 3 nor 5, append the number itself to the result
                    result.append(i).append("\n");
                }
            }

            // Print the result
            System.out.println(result.toString());
        }
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
