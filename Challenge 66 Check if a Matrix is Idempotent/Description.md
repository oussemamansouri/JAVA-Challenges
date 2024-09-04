# Check if a Matrix is Idempotent

Given a square matrix, the task is to check whether the matrix is idempotent or not.

**Idempotent Matrix:** A matrix is said to be idempotent if the multiplication of the matrix by itself returns the same matrix. A matrix M is said to be idempotent if and only if M * M = M. In an idempotent matrix, M is a square matrix.

Create a method named `checkIdempotence` to determine if the matrix is idempotent or not.

## Example Output:

**Input:**

```java
int mat1[][] = {{9, -2, -4},  
       {-1, 3, 4},  
       {1, -2, -3}};
```     
**Output:**

false

**Input:**

```java
int mat2[][] = {{2, -2, -4},  
       {-1, 3, 4},  
       {1, -2, -3}};
```     
**Output:**

true