# 896. Monotonic Array

## Approach

1. Initialize two boolean variables to assume that the array is both increasing and decreasing.

   ```java
   boolean increasing = true;
   boolean decreasing = true;
   ```

    * `increasing` → checks whether the array is monotonically increasing.
    * `decreasing` → checks whether the array is monotonically decreasing.

2. Initialize two pointers, one at the beginning and one at the end of the array.

   ```java
   int l = 0;
   int r = nums.length - 1;
   ```

    * `l` → left pointer
    * `r` → right pointer

3. Traverse the array using the two pointers while `l < r`.

   ```java
   while(l < r){
   ```

4. Check whether the array violates the increasing condition.

   ```java
   if(nums[l] > nums[l + 1] || nums[r - 1] > nums[r]){
       increasing = false;
   }
   ```

   For a monotonically increasing array, every element must be less than or equal to the next element.

   If either side violates this condition, the array cannot be increasing.

5. Check whether the array violates the decreasing condition.

   ```java
   if(nums[l] < nums[l + 1] || nums[r - 1] < nums[r]){
       decreasing = false;
   }
   ```

   For a monotonically decreasing array, every element must be greater than or equal to the next element.

   If either side violates this condition, the array cannot be decreasing.

6. Move both pointers toward the center.

   ```java
   l++;
   r--;
   ```

   This allows us to check pairs from both ends of the array.

7. After traversing the array, return `true` if the array is either increasing or decreasing.

   ```java
   return increasing || decreasing;
   ```

   An array is monotonic if it is either:

    * Monotonically increasing
    * Monotonically decreasing

### Example

For:

```text
[1, 2, 2, 3]
```

The comparisons are:

```text
1 <= 2  → increasing
2 <= 2  → increasing
2 <= 3  → increasing
```

So:

```text
increasing = true
decreasing = false
```

Answer:

```text
true
```

For:

```text
[6, 5, 5, 2, 1]
```

The array is monotonically decreasing:

```text
6 >= 5
5 >= 5
5 >= 2
2 >= 1
```

So:

```text
increasing = false
decreasing = true
```

Answer:

```text
true
```

For:

```text
[1, 3, 2]
```

The array is neither increasing nor decreasing.

```text
1 < 3  → increasing
3 > 2  → violates increasing

1 < 3  → violates decreasing
```

Therefore:

```text
increasing = false
decreasing = false
```

Answer:

```text
false
```

## Complexity

| Complexity | Value |
| ---------- | ----- |
| Time       | O(n)  |
| Space      | O(1)  |

## Java Solution

See `MonotonicArray.java`.
