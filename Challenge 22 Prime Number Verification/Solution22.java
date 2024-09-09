public class Solution22 {

    public static void main(String[] args) {
        int number1 = 17;
        int number2 = 15;

        // Check if the numbers are prime and print the results
        System.out.println("Input: " + number1);
        System.out.println("Output: " + number1 + " is a prime number: " + isPrimeNumber(number1));

        System.out.println("Input: " + number2);
        System.out.println("Output: " + number2 + " is a prime number: " + isPrimeNumber(number2));
    }

    // Method to determine if a given number is a prime number
    public static boolean isPrimeNumber(int number) {
        // A prime number is greater than 1 and has no divisors other than 1 and itself
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
