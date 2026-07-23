# 50. Pow(x, n)

## Approach

1. Handle special cases:
    - If `n == 0`, return `1.0`.
    - If `x == 0`, return `0.0`.
    - If `x == 1`, return `1.0`.
    - If `x == -1`, return:
        - `1.0` when `n` is even.
        - `-1.0` when `n` is odd.
2. Store the exponent in a `long` variable to safely handle the case when `n = Integer.MIN_VALUE`.
3. If the exponent is negative:
    - Replace `x` with `1 / x`.
    - Convert the exponent to a positive value.
4. Initialize `ans = 1.0`.
5. Use **Binary Exponentiation (Exponentiation by Squaring)**:
    - While the exponent is greater than `0`:
        - If the exponent is odd, multiply `ans` by `x`.
        - Square `x`.
        - Divide the exponent by `2`.
6. Return `ans` as the final result.

## Complexity

| Complexity | Value |
| ---------- | ----- |
| Time | O(log n) |
| Space | O(1) |

> **Note:** More precisely, the time complexity is **O(log |n|)** since the exponent is repeatedly halved.

## Java Solution

See `PowX_N.java`.