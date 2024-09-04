# Common Elements

Given an n x n matrix, the challenge is to find all distinct elements that are common to all rows of the matrix.

Write a method named `distinct` that takes an n x n matrix as a parameter and returns a sorted array in ascending order containing the distinct elements common to all rows of the matrix.

## Example Output:

**Input:**

```java
        int matrix[][] = { 
            { 2, 1, 4, 3 },
            { 1, 2, 3, 2 },
            { 3, 6, 2, 3 },
            { 5, 2, 5, 3 } 
        };
```
**Output:**

[2, 3]