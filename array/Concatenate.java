package array;

import java.util.Arrays;

public class Concatenate {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        int len = arr.length;
        int[] nums = new int[len*2];

        for (int i = 0; i < len; i++) {
            nums[i] = arr[i];
            nums[i+len] = arr[i];
        }

        System.out.println(Arrays.toString(nums));
    }
}
