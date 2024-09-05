# Circular Rotations of Matrix Rows

Given an n x n matrix, the task is to determine if all the rows are circular rotations of each other.

## Method:
Create a method `isCircularMatrix`, which takes a matrix as a parameter and returns `true` if all rows are circular rotations of each other, otherwise returns `false`.

### Example Output:

**Input:**

```java
 int[][] matrix1 = {
     {1, 2, 3},
     {3, 1, 2},
     {2, 3, 1}
 };
```

**Output:**
true

**Input:**
```java
  int[][] matrix2 = {
      {1, 2, 3},
      {3, 2, 1},
      {2, 3, 1}
  };
```        
**Output:**
false