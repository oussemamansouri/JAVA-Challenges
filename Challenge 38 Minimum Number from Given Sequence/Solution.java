public class Solution {

    public static int minSequence(String pattern) {
        int n = pattern.length();
        int[] result = new int[n + 1];
        int current = 1;

        // Fill the result array based on the pattern
        for (int i = 0; i <= n; i++) {
            result[i] = current++;
            // If the end of the pattern is reached or a 'D' is encountered
            if (i == n || pattern.charAt(i) == 'D') {
                reverse(result, i - current + 1, i);
                current = 1;
            }
        }

        // Convert the result array to a single integer
        int num = 0;
        for (int i = 0; i < n + 1; i++) {
            num = num * 10 + result[i];
        }

        return num;
    }

    // Helper method to reverse a portion of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // Test the minSequence method
        System.out.println(minSequence("D")); // Output: 21
    }
}
