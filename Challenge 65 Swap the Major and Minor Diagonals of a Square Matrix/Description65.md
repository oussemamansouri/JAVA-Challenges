# Swap the Major and Minor Diagonals of a Square Matrix

Write a method named `swapDiagonals` that takes an n x n matrix as a parameter, swaps the elements of the major and minor diagonals, and returns a new n x n matrix without modifying the original matrix.

## Example Output:

**Input:**

```java
        int[][] matrix = {
            { 9, 1, 7, 2 },
            { 3, 6, 4, 5 },
            { 3, 4, 9, 5 },
            { 6, 7, 2, 8 }
        };
```
**Output:**

Original Matrix:

[9, 1, 7, 2]

[3, 6, 4, 5]

[3, 4, 9, 5]

[6, 7, 2, 8]

Matrix with Swapped Diagonals:

[2, 1, 7, 9]

[3, 4, 6, 5]

[3, 9, 4, 5]

[8, 7, 2, 6]
