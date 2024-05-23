import java.util.Scanner;  // Import the Scanner class for reading input from the user

public class Solution {  // Define the main class named 'Solution'
    public static void main(String[] args) {  // Main method: the entry point of the program
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read input from the console
        
        System.out.print("Enter the temperature in Celsius: ");  // Prompt the user to enter a temperature in Celsius
        double celsius = scanner.nextDouble();  // Read the user's input as a double and store it in the variable 'celsius'
        
        double fahrenheit = celsius * 9 / 5 + 32;  // Convert the Celsius temperature to Fahrenheit using the formula
        
        // Print the result: the input temperature in Celsius and the converted temperature in Fahrenheit
        System.out.printf("%.1f degrees Celsius is equal to %.1f degrees Fahrenheit\n", celsius, fahrenheit);
        
        scanner.close();  // Close the scanner to free up resources
    }
}
