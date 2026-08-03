public class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {

        // Create a frequency array for 26 lowercase letters
        int[] count = new int[26];

        // Count the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Find the first character whose frequency is 1
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        // No unique character found
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(firstUniqChar("leetcode"));      // 0
        System.out.println(firstUniqChar("loveleetcode"));  // 2
        System.out.println(firstUniqChar("aabb"));          // -1
        System.out.println(firstUniqChar("z"));             // 0

    }
}