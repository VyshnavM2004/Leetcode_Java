# 26. Remove Duplicates from Sorted Array

## Approach

1. Since the array is already sorted, duplicate elements will always be adjacent.
2. Initialize a pointer `k = 1` to keep track of the position where the next unique element should be placed.
3. Traverse the array starting from the second element (`i = 1`).
4. Compare the current element `nums[i]` with the previous element `nums[i - 1]`.
5. If they are different, copy `nums[i]` to `nums[k]` and increment `k`.
6. Continue until all elements have been processed.
7. Return `k`, which represents the number of unique elements.

## Complexity

| Complexity | Value |
| ---------- | ----- |
| Time       | O(n)  |
| Space      | O(1)  |

> **Note:** The algorithm modifies the input array in-place using only a single extra variable (`k`), so the auxiliary space complexity is **O(1)**.

## Java Solution

See `DuplicatesFromSortedArray.java`.