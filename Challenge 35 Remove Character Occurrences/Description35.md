# Remove Character Occurrences

Write a method named `removeOccurrences`. This method should remove all occurrences of a specific character in a string. The method takes as parameters a string `inputString`, a character `charToRemove`, as well as two booleans: `caseSensitive` to indicate if the search should be case-sensitive and `specialCharSensitive` to indicate if the search should be sensitive to special characters.

`removeOccurrences(inputString, charToRemove, caseSensitive, specialCharSensitive)`

### Example Output:

**Input:** `"anticonstitutionnÉllemènt"`, `'e'`, `false`, `false`  
**Output:** `anticonstitutionnllmnt`

**Input:** `"anticonstitutionnÉllemEnt"`, `'e'`, `true`, `false`  
**Output:** `anticonstitutionnÉllmEnt`

**Input:** `"anticonstitutionnÉllemènt"`, `'e'`, `false`, `true`  
**Output:** `anticonstitutionnÉllmènt`

**Input:** `"anticonstitutionnÉllEment"`, `'e'`, `true`, `true`  
**Output:** `anticonstitutionnÉllEmnt`
