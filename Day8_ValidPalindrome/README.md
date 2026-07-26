# 125. Valid Palindrome

## Approach

1. Initialize two pointers:
    - `left = 0`
    - `right = s.length() - 1`
2. Traverse the string from both ends using a `while (left < right)` loop.
3. Skip any character that is **not** a letter or digit using:
   ```java
   Character.isLetterOrDigit()
   ```
4. Once both pointers point to alphanumeric characters, compare them after converting both to the same case using:
   ```java
   Character.toLowerCase()
   ```
5. If the characters are different, return `false`.
6. If they are the same, move both pointers inward:
   ```java
   left++;
   right--;
   ```
7. Continue until the pointers meet or cross.
8. If no mismatch is found, return `true`.

## Complexity

| Complexity | Value |
| ---------- | ----- |
| Time       | O(n) |
| Space      | O(1) |

## Java Solution

See `ValidPalindrome.java`.