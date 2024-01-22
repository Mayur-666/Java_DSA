package Sorting;

import java.util.Arrays;

//  array have numbers from 1 to n , one number is repeated twice 
//  print that number and the number that didn't appeared in array 
public class SetMisMatch {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4 };
        cyclicSort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i] - 1) {
                System.out.println(Arrays.toString(new int[] { nums[i], (i + 1) }));
            }
        }
    }

    public static void cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
    }
}