# Selection of Activities

```java
class Activity {
    int start;
    int end;

    // Constructor
    public Activity(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
```
You are given `n` activities with their start and end times. The goal is to select the maximum number of activities that can be performed by a single person, assuming that one person can work on only one activity at a time.

## Task

Create a method `maxActivities` that takes an array of activities as input and returns an array of activities that can be performed by a single person.

## Example Output

**Input:**  
{{start=10, end=20}, {start=12, end=25}, {start=20, end=30}}

**Output:**
{{start=10, end=20}, {start=20, end=30}}
