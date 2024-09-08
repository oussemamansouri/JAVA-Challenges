import java.util.Scanner;  // Import the Scanner class for reading input from the user

public class Solution03 {  // Define the main class named 'Solution'
    public static void main(String[] args) {  // Main method: the entry point of the program
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read input from the console
        
        System.out.print("Input: ");  // Prompt the user to input a number
        int n = scanner.nextInt();  // Read the user's input as an integer and store it in the variable 'n'
        
        long result = calculateFactorial(n);  // Call the 'calculateFactorial' method to compute the factorial
        
        if (result == -1) {  // If the result is -1, it indicates an invalid input
            System.out.println("Error: Invalid input. Please enter a positive integer.");  // Print an error message for invalid input
        } else {
            System.out.println("The factorial of " + n + " is: " + result + ".");  // Print the result if input is valid
        }
        
        scanner.close();  // Close the scanner to free up resources
    }
    
    // Method to calculate factorial
    public static long calculateFactorial(int n) {
        if (n < 0) {  // Check if the input number is negative
            return -1;  // Return -1 to indicate an invalid input
        }
        
        long factorial = 1;  // Initialize the factorial variable to 1
        for (int i = 1; i <= n; i++) {  // Loop to calculate the factorial
            factorial *= i;  // Update factorial by multiplying with the current value of 'i'
        }
        return factorial;  // Return the calculated factorial
    }
}