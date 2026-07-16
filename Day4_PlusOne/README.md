# 66. Plus One

## Approach

1. Start traversing the array from the last digit.
2. If the current digit is less than `9`, increment it by `1` and return the array.
3. If the current digit is `9`, change it to `0` and continue to the previous digit (carry).
4. If all digits are `9`, create a new array with one extra element.
5. Set the first element of the new array to `1` and return it. The remaining elements are `0` by default.

## Complexity

| Complexity | Value |
| ---------- | ----- |
| Time       | O(n)  |
| Space      | O(1)  |

> **Note:** In the special case where all digits are `9`, a new array of size `n + 1` is created. Although this requires `O(n)` space for the returned output, the auxiliary space used by the algorithm is considered **O(1)**.

## Java Solution

See `PlusOne.java`.
