# Matrix Mirror Across Diagonal

Given a 2D array of order N x N, display a matrix that is the mirror of the given matrix across the diagonal. The goal is to swap the values of the triangle above the diagonal with the values of the triangle below, like a mirror. Print the obtained 2D array in matrix format.

## Method
Create a method `mirrorMatrix` that mirrors the matrix and returns it.

### Example Output

**Input:**

```java
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
```        
**Output:**

Mirrored Matrix:

1 5 9 13 

2 6 10 14 

3 7 11 15 

4 8 12 16 