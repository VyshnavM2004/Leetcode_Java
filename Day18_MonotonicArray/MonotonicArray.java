public class MonotonicArray {

    public static void main(String[] args) {

        MonArr solution = new MonArr();

        int[] nums = {1, 2, 2, 3};

        boolean result = solution.isMonotonic(nums);

        System.out.println(result);
    }
}

class MonArr {

    public boolean isMonotonic(int[] nums) {

        int l = 0;
        int r = nums.length - 1;

        boolean increasing = true;
        boolean decreasing = true;

        while (l < r) {

            if (nums[l] > nums[l + 1] || nums[r - 1] > nums[r]) {
                increasing = false;
            }

            if (nums[l] < nums[l + 1] || nums[r - 1] < nums[r]) {
                decreasing = false;
            }

            l++;
            r--;
        }

        return increasing || decreasing;
    }
}