# 387. First Unique Character in a String

## Approach

1. Create an integer array of size `26` to store the frequency of each lowercase English letter.
2. Traverse the string once and count the frequency of every character.

   ```java
   count[s.charAt(i) - 'a']++;
   ```

3. Traverse the string a second time.
4. For each character, check its corresponding frequency in the array.

   ```java
   if (count[s.charAt(i) - 'a'] == 1)
   ```

5. If the frequency is `1`, return its index because it is the first unique character in the string.
6. If no character has a frequency of `1`, return `-1`.

## Complexity

| Complexity | Value |
| ---------- | ----- |
| Time       | O(n)  |
| Space      | O(1)  |

## Java Solution

See `FirstUniqueCharacter.java`.