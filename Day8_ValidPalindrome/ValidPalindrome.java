import java.util.Scanner;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            char left = s.charAt(l);
            char right = s.charAt(r);

            if (!Character.isLetterOrDigit(left)) {
                l++;
            } else if (!Character.isLetterOrDigit(right)) {
                r--;
            } else {
                if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                    return false;
                }
                l++;
                r--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println(isPalindrome(s));

        sc.close();
    }
}