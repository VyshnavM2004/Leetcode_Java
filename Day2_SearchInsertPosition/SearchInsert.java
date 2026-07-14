public class SearchInsert {

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 5};
        int target = 2;

        int index = searchInsert(nums, target);

        System.out.println("Insert/Search Position: " + index);
    }
}