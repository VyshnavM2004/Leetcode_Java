# 242. Valid Anagram

## Approach

1. Check if the lengths of both strings are equal.
    * If they are different, return `false` because anagrams must have the same number of characters.
2. Create an integer array of size `26` to store the frequency of each lowercase English letter.
3. Traverse both strings simultaneously using a `for` loop.
4. For each character in the first string, increment its corresponding index in the frequency array:

   ```java
   count[s.charAt(i) - 'a']++;
   ```

5. For each character in the second string, decrement its corresponding index in the same frequency array:

   ```java
   count[t.charAt(i) - 'a']--;
   ```

6. After traversing both strings, iterate through the frequency array.
7. If any value is not `0`, return `false` because the character frequencies do not match.
8. If all values are `0`, return `true` because both strings are valid anagrams.

## Complexity

| Complexity | Value |
| ---------- | ----- |
| Time       | O(n)  |
| Space      | O(1)  |

## Java Solution

See `ValidAnagram.java`.