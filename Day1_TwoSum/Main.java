import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] num = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            int diff = target - nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                if (diff == nums[j]) {
                    num[0] = i;
                    num[1] = j;
                    return num; // Return as soon as the pair is found
                }
            }
        }

        return num;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }
}