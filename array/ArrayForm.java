package array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayForm {
    public static void main(String[] args) {
        int[] nums = { 9, 9, 9, 9, 9, 9 };
        int k = 99;
        // add k to array form of integer
        System.out.println(arrayFormInt(nums, k));
    }

    static ArrayList<Integer> arrayFormInt(int[] nums, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;
        while (--n >= 0 || k > 0) {
            if (n >= 0) {
                k += nums[n];
            }
            ans.add(k % 10);
            k /= 10;
        }
        Collections.reverse(ans);
        return ans;
    }
}
