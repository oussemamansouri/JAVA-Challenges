import java.util.HashMap;
import java.util.Map;

public class Solution63 {

    // Method to count the number of employees under each manager
    public static Map<String, Integer> countEmployees(Map<String, String> employees) {
        // Map to store the final count of employees under each manager
        Map<String, Integer> managerCount = new HashMap<>();
        // Map to store the direct reports count for each manager
        Map<String, Integer> directReports = new HashMap<>();

        // Iterate through the employees map to count direct reports for each manager
        for (Map.Entry<String, String> employee : employees.entrySet()) {
            String employeeName = employee.getKey();
            String manager = employee.getValue();

            // Ensure that an employee is not their own manager (to avoid infinite loops)
            if (!manager.equals(employeeName)) {
                // Increment the count of direct reports for the manager
                directReports.put(manager, directReports.getOrDefault(manager, 0) + 1);
            }
        }

        // Calculate the total number of employees under each manager, including indirect reports
        for (Map.Entry<String, Integer> entry : directReports.entrySet()) {
            String manager = entry.getKey();
            int count = entry.getValue();

            // Traverse up the hierarchy to accumulate the count of employees under each manager
            while (employees.containsKey(manager) && !employees.get(manager).equals(manager)) {
                managerCount.put(manager, managerCount.getOrDefault(manager, 0) + count);
                manager = employees.get(manager);
            }
            // Ensure the top-level manager also has the count added
            managerCount.put(manager, managerCount.getOrDefault(manager, 0) + count);
        }

        // Return the map containing the count of employees under each manager
        return managerCount;
    }

    public static void main(String[] args) {
        // Test cases

        // Test case 1
        Map<String, String> employees1 = Map.of(
            "A", "C",
            "B", "C",
            "C", "F",
            "D", "E",
            "E", "F",
            "F", "F"
        );
        System.out.println(countEmployees(employees1)); // Expected Output: {C=2, E=1, F=4}

        // Test case 2
        Map<String, String> employees2 = Map.of(
            "A", "B",
            "B", "B"
        );
        System.out.println(countEmployees(employees2)); // Expected Output: {B=1}

        // Test case 3
        Map<String, String> employees3 = Map.of(
            "A", "C",
            "B", "C",
            "C", "D",
            "D", "D"
        );
        System.out.println(countEmployees(employees3)); // Expected Output: {C=2, D=3}

        // Test case 4
        Map<String, String> employees4 = Map.of(
            "A", "F",
            "B", "F",
            "C", "F",
            "D", "F",
            "E", "F",
            "F", "F"
        );
        System.out.println(countEmployees(employees4)); // Expected Output: {F=5}
    }
}
