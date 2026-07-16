import java.util.Arrays;

public class plusOne {

    public static int[] onePlus(int[] digits) {

        // Start from the last digit
        for (int i = digits.length - 1; i >= 0; i--) {

            // If digit is less than 9, simply add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, make it 0 and carry continues
            digits[i] = 0;
        }

        // If all digits were 9, create a new array
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {

        int[] digits = {9, 9, 9};

        int[] answer = onePlus(digits);

        System.out.println(Arrays.toString(answer));
    }
}