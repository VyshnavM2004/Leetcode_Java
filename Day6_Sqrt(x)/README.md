# 69. Sqrt(x)

## Approach

1. Handle the special case where `x` is `0` by returning `0`.
2. Use **Binary Search** to find the integer square root.
3. Initialize two pointers:
    - `left = 1`
    - `right = x`
4. Calculate the middle value using:
   ```java
   mid = left + (right - left) / 2;
   ```
   This prevents integer overflow.
5. Compute the square of `mid` using a `long`:
   ```java
   long square = (long) mid * mid;
   ```
   This avoids overflow when multiplying large integers.
6. If `square == x`, return `mid`.
7. If `square < x`, search the right half by updating `left = mid + 1`.
8. Otherwise, search the left half by updating `right = mid - 1`.
9. When the loop ends, `right` contains the integer part (floor) of the square root, so return `right`.

## Complexity

| Complexity | Value |
| ---------- | ----- |
| Time       | O(log x) |
| Space      | O(1) |

## Java Solution

See `Sqrt.java`.