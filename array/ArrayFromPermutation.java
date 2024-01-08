package array;

import java.util.Arrays;

public class ArrayFromPermutation {
    // 1st method
    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 5, 3, 4 };
        int len = arr.length;
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = arr[arr[i]];
        }
        System.out.println("0 ms time :- " + Arrays.toString(nums));
        main1(arr);
    }

    // 2nd method
    public static void main1(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] + n * (arr[arr[i]] % n); // a = r + bq
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / n;
        }
        System.out.println("O(1) space :- " + Arrays.toString(arr));
    }
}
