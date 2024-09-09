import java.util.Arrays;
import java.util.Comparator;

// Class representing an Activity with start and end times
class Activity {
    int start;
    int end;

    // Constructor to initialize an activity with start and end times
    public Activity(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "{start=" + start + ", end=" + end + "}";
    }
}

public class Solution71 {

    /**
     * Method to find the maximum number of activities that can be performed by a single person.
     * 
     * @param activities Array of activities with start and end times.
     * @return Array of selected activities that can be performed by one person.
     */
    public static Activity[] maxActivities(Activity[] activities) {
        // Sort activities by their end times
        Arrays.sort(activities, Comparator.comparingInt(a -> a.end));

        // Array to store the selected activities
        Activity[] result = new Activity[activities.length];
        int count = 0;
        int lastEnd = -1;

        // Iterate over the sorted activities
        for (Activity activity : activities) {
            // Select activity if it starts after or when the last selected activity ends
            if (activity.start >= lastEnd) {
                result[count++] = activity;
                lastEnd = activity.end;
            }
        }

        // Return the array of selected activities
        return Arrays.copyOf(result, count);
    }

    // Main method for testing the solution
    public static void main(String[] args) {
        // Define an array of activities with start and end times
        Activity[] activities = {
            new Activity(10, 20),
            new Activity(12, 25),
            new Activity(20, 30)
        };

        // Call the maxActivities method and store the result
        Activity[] selectedActivities = maxActivities(activities);

        // Print the selected activities
        System.out.println("Selected activities:");
        for (Activity activity : selectedActivities) {
            System.out.println(activity);
        }
    }
}