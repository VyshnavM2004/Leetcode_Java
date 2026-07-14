# 35. Search Insert Position

## Approach

1. Initialize two pointers: `left` and `right`.
2. Use Binary Search to find the target.
3. If the target is found, return its index.
4. If the target is not found, return the position where it should be inserted (`left`).

## Complexity

| Complexity | Value |
|------------|-------|
| Time | O(log n) |
| Space | O(1) |

## Java Solution

See `SearchInsert.java`.