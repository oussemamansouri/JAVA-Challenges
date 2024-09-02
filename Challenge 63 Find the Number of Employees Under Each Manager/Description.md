# Find the Number of Employees Under Each Manager

Given a dictionary that contains the mapping between an employee and their manager in the form of several (employee, manager) pairs as shown below:

In this example, C is the manager of A, C is also the manager of B, F is the manager of C, and so on.

Write a method named `countEmployees` that takes:

- A dictionary of (employee, manager) pairs, `Map<String, String>`, as a parameter.

And returns:

- A dictionary of (manager, numberOfEmployees), `Map<String, Integer>`, as the result of the calculation.

### Example Output:

**Input:**

{ "A", "C" }, 
{ "B", "C" }, 
{ "C", "F" }, 
{ "D", "E" }, 
{ "G", "F" }

**Output:**

result = { C=2, E=1, F=4 }
