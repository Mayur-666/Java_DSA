package array;

import java.util.Arrays;

//add one to array form of integer
public class PlusOne {
    public static void main(String[] args) {
        int[] nums = { 2, 9, 9, 9, 9, 9 };
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 9) {
                nums[i]++;
                System.out.println(Arrays.toString(nums));
                System.exit(0);
            }
            nums[i] = 0;
        }
        nums = new int[nums.length + 1];
        nums[0] = 1;
        System.out.println(Arrays.toString(nums));
    }
}
