import java.util.Scanner;  // Import the Scanner class for reading input from the user

public class Solution {  // Define the main class named 'Solution'
    public static void main(String[] args) throws Exception {  // Main method: the entry point of the program, can throw exceptions
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read input from the console

        System.out.println("Enter a number:");  // Prompt the user to enter a number
        int n = scanner.nextInt();  // Read the user's input as an integer and store it in the variable 'n'

        if (isEvenNumber(n)) {  // Check if the number 'n' is even by calling the 'isEvenNumber' method
            System.out.println("even");  // Print "even" if the number is even
        } else {
            System.out.println("odd");  // Print "odd" if the number is not even
        }

        scanner.close();  // Close the scanner to free up resources
    }

    // Method to check if a number is even
    public static boolean isEvenNumber(int n) {
        if (n % 2 == 0) {  // If the remainder of 'n' divided by 2 is 0, then 'n' is even
            return true;  // Return true if the number is even
        } else {
            return false;  // Return false if the number is odd
        }
    }
}
