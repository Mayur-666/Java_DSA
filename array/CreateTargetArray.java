package array;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArray {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        int indices[] = { 0, 1, 0, 2 };
        System.out.println(Arrays.toString(targetArrayinGivenOrder(nums, indices)));
    }

    // put value num[i] in target at position index[i]
    public static int[] targetArrayinGivenOrder(int[] nums, int[] indices) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            arr.add(indices[i], nums[i]);
        }
        int[] target = new int[n];
        for (int i = 0; i < n; i++) {
            target[i] = arr.get(i);
        }
        return target;
    }
}
