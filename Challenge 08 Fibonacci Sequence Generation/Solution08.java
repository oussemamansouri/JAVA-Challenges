import java.util.*;

public class Solution08 {

    // Method to generate and display the first n terms of the Fibonacci sequence
    public static void fibonacciSequence(int n) {
        int number1 = 0;
        int number2 = 1;
        System.out.print("Fibonacci sequence up to term " + n + ": ");
        
        for (int i = 1; i <= n; ++i) {
            System.out.print(number1 + " ");
            int sum = number1 + number2; // Calculate the next term
            number1 = number2; // Update the value of number1
            number2 = sum; // Update the value of number2
        }
        System.out.println(); // Print a new line at the end
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Please enter a positive integer: ");
        n = scanner.nextInt(); // Read the integer input
        fibonacciSequence(n); // Call the fibonacciSequence method
        
        scanner.close(); // Close the scanner
    }
}
