import java.util.ArrayList;
import java.util.Arrays;

class Solution39 {
    /**
     * Finds the shortest path to type the given string on a screen with a remote control.
     * 
     * @param input the input string
     * @return an array of strings representing the path
     */
    static String[] shortestPath(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid string");
        }

        // Convert the input string to uppercase to handle case insensitivity
        input = input.toUpperCase();

        // List to store the sequence of moves
        ArrayList<String> res = new ArrayList<>();
        // Initial position on the screen
        int curX = 0, curY = 0;

        for (char c : input.toCharArray()) {
            if (!Character.isLetter(c)) {
                throw new IllegalArgumentException("Invalid character in the string: " + c);
            }

            // Calculate target position for the character
            int nextX = (c - 'A') / 5;
            int nextY = (c - 'A') % 5;

            // Move vertically to the target row
            while (curX != nextX) {
                res.add(curX > nextX ? "Up" : "Down");
                curX += (curX > nextX) ? -1 : 1;
            }

            // Move horizontally to the target column
            while (curY != nextY) {
                res.add(curY > nextY ? "Left" : "Right");
                curY += (curY > nextY) ? -1 : 1;
            }

            // Press OK to select the character
            res.add("OK");
        }

        // Convert the list of moves to an array and return it
        return res.toArray(new String[res.size()]);
    }

    /**
     * Custom assertion method to compare expected and actual results
     */
    public static void assertArrayEquals(String[] expected, String[] actual) {
        if (!Arrays.equals(expected, actual)) {
            throw new AssertionError("Expected: " + Arrays.toString(expected) + ", but got: " + Arrays.toString(actual));
        }
    }

    /**
     * Test method for shortestPath.
     */
    @SuppressWarnings("static-access")
    public static void testShortestPath() {
        Solution39 s = new Solution39();

        // Test case 1: Single character 'A'
        String[] expected = {"OK"};
        assertArrayEquals(expected, s.shortestPath("A"));

        // Test case 2: Single character 'z', should be converted to 'Z'
        expected = new String[]{"OK"};
        assertArrayEquals(expected, s.shortestPath("z"));

        // Test case 3: String with mixed case "bas", should be converted to "BAS"
        expected = new String[]{"Down", "OK", "Up", "OK"};
        assertArrayEquals(expected, s.shortestPath("bas"));

        // Test case 4: Single word "Haut", should be converted to "HAUT"
        expected = new String[]{"Down", "OK"};
        assertArrayEquals(expected, s.shortestPath("Haut"));

        // Test case 5: Single word "res", should be converted to "RES"
        expected = new String[]{"OK"};
        assertArrayEquals(expected, s.shortestPath("res"));

        // Test case 6: Empty string should throw an exception
        try {
            s.shortestPath("");
        } catch (IllegalArgumentException e) {
            System.out.println("Expected exception for empty string: " + e.getMessage());
        }

        // Test case 7: String with invalid character ';' should throw an exception
        try {
            s.shortestPath(";");
        } catch (IllegalArgumentException e) {
            System.out.println("Expected exception for invalid character ';': " + e.getMessage());
        }

        // Test case 8: String with invalid character '@' should throw an exception
        try {
            s.shortestPath("@");
        } catch (IllegalArgumentException e) {
            System.out.println("Expected exception for invalid character '@': " + e.getMessage());
        }

        // Test case 9: String with invalid character '7' should throw an exception
        try {
            s.shortestPath("7");
        } catch (IllegalArgumentException e) {
            System.out.println("Expected exception for invalid character '7': " + e.getMessage());
        }

        // Test case 10: Specific string "uh"
        expected = new String[]{"Right", "Right", "Up", "Up", "Left", "OK"};
        assertArrayEquals(expected, s.shortestPath("uh"));
    }

    public static void main(String[] args) {
        // Run tests
        testShortestPath();

        // Example usage
        String input = "COZY";
        String[] result = Solution39.shortestPath(input);

        // Print the result
        for (String step : result) {
            System.out.print(step + " ");
        }
    }
}
