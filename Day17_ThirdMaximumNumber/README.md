# 414. Third Maximum Number

## Approach

1. Initialize three variables to store the three largest **distinct** numbers.

   ```java
   long first = Long.MIN_VALUE;
   long second = Long.MIN_VALUE;
   long third = Long.MIN_VALUE;
   ```

- `first` → largest number
- `second` → second largest number
- `third` → third largest number

2. Traverse the array element by element.

   ```java
   for(int i = 0; i < nums.length; i++){
   ```

3. Skip the number if it is already present among `first`, `second`, or `third`. This ensures that duplicates are not counted.

   ```java
   if(nums[i] == first || nums[i] == second || nums[i] == third){
       continue;
   }
   ```

4. If the current number is greater than `first`, shift the existing values down.

   ```java
   if(nums[i] > first){
       third = second;
       second = first;
       first = nums[i];
   }
   ```

5. Otherwise, if the current number is greater than `second`, update `second`.

   ```java
   else if(nums[i] > second){
       third = second;
       second = nums[i];
   }
   ```

6. Otherwise, if the current number is greater than `third`, update `third`.

   ```java
   else if(nums[i] > third){
       third = nums[i];
   }
   ```

7. After traversing the array, check whether a third distinct maximum exists. If it doesn't, return the largest number.

   ```java
   if(third == Long.MIN_VALUE){
       return (int) first;
   }
   ```

8. Otherwise, return the third maximum.

   ```java
   return (int) third;
   ```

> **Important:** We use `long` instead of `int` for `first`, `second`, and `third` because `Integer.MIN_VALUE` can be a valid element in the input array. Using `Long.MIN_VALUE` lets us safely use it as the initial marker.

### Example

For:

```text
[2, 2, 3, 1]
```

The values change like this:

```text
2 → first = 2, second = MIN, third = MIN

2 → duplicate → skip

3 → first = 3, second = 2, third = MIN

1 → first = 3, second = 2, third = 1
```

Since there are three distinct numbers, the answer is:

```text
1
```

For:

```text
[3, 2, 1]
```

```text
first = 3
second = 2
third = 1
```

Answer:

```text
1
```

For:

```text
[3, 3, 2]
```

There are only two distinct numbers, so the third maximum does not exist. Therefore, return the maximum:

```text
3
```

## Complexity

| Complexity | Value |
| ---------- | ----- |
| Time       | O(n)  |
| Space      | O(1)  |

## Java Solution

See `ThirdMaximum.java`.