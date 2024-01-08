package array;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 1, 5, 7, 9, 4, 2 };
        int k = 9;
        HashMap<Integer, Integer> arr = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = k - nums[i];
            if (arr.containsKey(diff)) {
                // printing indices of number
                System.out.println("[" + arr.get(diff) + ", " + i + "]");
                System.exit(0);
            }
            arr.put(nums[i], i);
        }
        System.out.println(-1);
    }
}
