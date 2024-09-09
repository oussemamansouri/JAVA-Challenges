# Conversion from Prefix to Infix

**Infix:** An expression is called an infix expression if the operator appears between the operands in the expression. Simply in the form of (operand1 operator operand2). Example: (A+B) * (C-D)

**Prefix:** An expression is called a prefix expression if the operator appears in the expression before the operands. Simply in the form of (operator operand1 operand2).

**Prefix Example:** `*+AB-CD`  
**Infix:** `(A+B) * (C-D)`

Given a prefix expression, convert it into an infix expression. Computers generally perform calculations in prefix or postfix (usually postfix). However, for humans, it is easier to understand an infix expression rather than a prefix one. That’s why the conversion is necessary for human understanding.

Write a method named `convert` to perform the conversion from a prefix expression to an infix expression.

**Example Output:**

- **Input:** `*-A/FC-/ADL`
- **Output:** `((A-(F/C))*((A/D)-L))`
