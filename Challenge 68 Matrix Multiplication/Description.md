# Matrix Multiplication

Given two matrices, the task is to multiply them. The matrices can be either square or rectangular.

Let A be a matrix of dimensions m x n (m rows and n columns), and B be a matrix of dimensions n x p (n rows and p columns). The matrix product of A and B, denoted as AB, results in a matrix C of dimensions m x p. Each element of the resulting matrix C is obtained by multiplying the corresponding elements from the rows of A with the columns of B and summing these products.

![Example 1](./example1.png)
![Example 2](./example2.png)

## Element Calculation

The elements of C are calculated as follows:

- \( C_{11} = (a_{11} \times b_{11}) + (a_{12} \times b_{21}) + (a_{13} \times b_{31}) \)
- \( C_{12} = (a_{11} \times b_{12}) + (a_{12} \times b_{22}) + (a_{13} \times b_{32}) \)
- \( C_{13} = (a_{11} \times b_{13}) + (a_{12} \times b_{23}) + (a_{13} \times b_{33}) \)
- \( C_{14} = (a_{11} \times b_{14}) + (a_{12} \times b_{24}) + (a_{13} \times b_{34}) \)
- \( C_{21} = (a_{21} \times b_{11}) + (a_{22} \times b_{21}) + (a_{23} \times b_{31}) \)
- \( C_{22} = (a_{21} \times b_{12}) + (a_{22} \times b_{22}) + (a_{23} \times b_{32}) \)
- \( C_{23} = (a_{21} \times b_{13}) + (a_{22} \times b_{23}) + (a_{23} \times b_{33}) \)
- \( C_{24} = (a_{21} \times b_{14}) + (a_{22} \times b_{24}) + (a_{23} \times b_{34}) \)

## Method

Create a method `multiplyMatrix` that takes matrices A and B as parameters and returns the resulting matrix C = A * B.

### Example Output:

**Input:**

```java
mat1[3][2] = {
    {1, 1},
    {2, 2},
    {3, 3}
};

mat2[2][3] = {
    {1, 1, 1},
    {2, 2, 2}
};
```
**Output:**

result[3][3] = {

    {3, 3, 3},

    {6, 6, 6},

    {9, 9, 9}

};
