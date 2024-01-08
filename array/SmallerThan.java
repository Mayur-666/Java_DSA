package array;

import java.util.Arrays;

public class SmallerThan {
    public static void main(String[] args) {
        int[] nums = { 8, 3, 1, 1, 0, 2 };
        System.out.println(Arrays.toString(numSmallerThanCurrentNum(nums)));
    }

    public static int[] numSmallerThanCurrentNum(int[] nums) {
        int count[] = new int[102];
        for (int i : nums) {
            count[i + 1]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = count[nums[i]];
        }
        return nums;
    }
}
