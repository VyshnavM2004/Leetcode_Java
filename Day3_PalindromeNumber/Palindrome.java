class palNum {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}

public class Palindrome {
    public static void main(String[] args) {
        // Example 1
        int x = 121;

        palNum solution = new palNum();
        boolean output = solution.isPalindrome(x);

        System.out.println("Input: x = " + x);
        System.out.println("Output: " + output);
    }
}