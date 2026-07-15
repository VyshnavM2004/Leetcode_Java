# 9. Palindrome Number

## Approach

1. Convert the integer into a string using `Integer.toString()`.
2. Compare the characters from the beginning and the end of the string.
3. Continue moving inward until the middle of the string.
4. If any pair of characters does not match, return `false`.
5. If all corresponding characters match, return `true`.

## Complexity

| Complexity | Value |
| ---------- | ----- |
| Time       | O(n)  |
| Space      | O(n)  |

## Java Solution

See `Palindrome.java`.
