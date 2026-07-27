# 344. Reverse String

## Approach

1. Initialize two pointers:
    - `left = 0`
    - `right = s.length - 1`
2. Traverse the character array using a `while (left < right)` loop.
3. Swap the characters at the `left` and `right` indices using a temporary variable:
   ```java
   char temp = s[left];
   s[left] = s[right];
   s[right] = temp;
   ```
4. Move both pointers inward:
   ```java
   left++;
   right--;
   ```
5. Continue until the pointers meet or cross.
6. The input array is now reversed in-place.

## Complexity

| Complexity | Value |
| ---------- | ----- |
| Time       | O(n) |
| Space      | O(1) |

## Java Solution

See `reverseString.java`.