
# Calculation of Unique Paths in a Grid

Write a method named `numberOfUniquePaths` that takes two integers m and n representing the number of rows and columns in a grid, respectively, and returns the number of unique paths to move from the top-left corner to the bottom-right corner, moving only down or right.

## Example Output:
Input: rows = 3, columns = 3
* Output: 6

Example of a 3x3 grid:

0   1   2
3   4   5
6   7   8

Unique Paths to go from 0 to 8:

0 -> 1 -> 2 -> 5 -> 8
0 -> 1 -> 4 -> 5 -> 8
0 -> 1 -> 4 -> 7 -> 8
0 -> 3 -> 4 -> 5 -> 8
0 -> 3 -> 4 -> 7 -> 8
0 -> 3 -> 6 -> 7 -> 8