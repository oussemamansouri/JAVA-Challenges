# Determine if One Array is a Subset of Another

Given two arrays: `arr1` and `arr2`. Determine if `arr2[]` is a subset of `arr1[]`. The two arrays are not sorted. You can assume that the elements in both arrays are distinct.

Write a method named `isSubset` that takes two arrays as parameters and returns `true` if the second array is a subset of the first array, otherwise returns `false`.

### Example Output:

**Input:**

```java
int[] arr1 = { 11, 1, 13, 21, 3, 7 };
int[] arr2 = { 11, 3, 7, 8 };
```
**Output:** false

**Input:**

```java
int[] arr1 = { 11, 1, 13, 21, 3, 7 };
int[] arr2 = { 11, 3, 7, 1 };
```
**Output:** true