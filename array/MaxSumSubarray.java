package array;

public class MaxSumSubarray {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        // find maximum sum among all subarrays that can be generated through nums
        // for above arrays ans will be {4,-1,2,1} = 6
        int ans = nums[0];
        int sum = 0;
        for (int i : nums) {
            sum = Math.max(i, i + sum);
            ans = Math.max(sum, ans);
        }
        System.out.println(ans);
    }
}
