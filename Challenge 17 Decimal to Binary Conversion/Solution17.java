import java.util.Scanner;

public class Solution17 {

    // Method to convert decimal to binary
    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder(); // StringBuilder to store binary digits
        
        // Loop to perform division by 2 until quotient becomes 0
        while (decimal > 0) {
            int remainder = decimal % 2; // Get remainder by dividing by 2
            binary.insert(0, remainder); // Insert remainder at the beginning of the string
            decimal = decimal / 2; // Update decimal by dividing by 2
        }
        
        return binary.toString(); // Return binary representation as string
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt(); // Read decimal number from user
        
        // Convert decimal to binary using the method and print the result
        System.out.println("The decimal number " + decimal + " in binary is: " + decimalToBinary(decimal));
        
        scanner.close(); // Close scanner to avoid resource leak
    }
}
