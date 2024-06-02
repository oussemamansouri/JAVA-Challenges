# Verification of Parentheses Balance

This repository contains a Java solution for verifying the balance of parentheses in a given expression. The solution includes two methods: `parenthesesCorrespondantes` and `estEquilibreParentheses`.

## Problem Description

### Task

1. **Method `parenthesesCorrespondantes`**: 
   - This method takes two characters as input and returns `true` if the characters are matching parentheses: `()`, `{}`, `[]`.

2. **Method `estEquilibreParentheses`**:
   - This method takes a string containing an expression with parentheses and checks if the parentheses in the expression are balanced (i.e., if each opening parenthesis has a corresponding closing parenthesis).

### Example Output

#### Input:
```text
"{[()]}"
Output:
The expression {[()]} is balanced: true
Input:
"{[(])}"
Output:
The expression {[(])} is balanced: false
