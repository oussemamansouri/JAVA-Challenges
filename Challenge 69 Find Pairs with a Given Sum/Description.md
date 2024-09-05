# Find Pairs with a Given Sum

Given an m x n matrix of integers and an integer K, the task is to find all pairs in the matrix whose sum equals K. Each element of a pair must come from different rows, meaning the pair cannot be from the same row.

## Method:
Create a method `findPairs` that takes a matrix and an integer `K` as parameters and returns a two-dimensional array sorted in ascending order of all unique pairs that form the sum K.

### Example Output:

**Input:**

```java
int[][] matrix = {
        {1, 0, 4},
        {5, 2, 3},
        {6, 2, 3}
        };
int z = 4;
```

**Output:**

1 3
            
2 2