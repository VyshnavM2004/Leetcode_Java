public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        // Step 1: Check if both strings have the same length
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Create a frequency array for 26 lowercase letters
        int[] count = new int[26];

        // Step 3: Traverse both strings
        for (int i = 0; i < s.length(); i++) {

            // Increment count for characters in s
            count[s.charAt(i) - 'a']++;

            // Decrement count for characters in t
            count[t.charAt(i) - 'a']--;
        }

        // Step 4: Check if all counts are zero
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        // Step 5: If all counts are zero, they are anagrams
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("anagram", "nagaram")); // true
        System.out.println(isAnagram("rat", "car"));         // false
        System.out.println(isAnagram("a", "ab"));            // false
        System.out.println(isAnagram("listen", "silent"));   // true
    }
}