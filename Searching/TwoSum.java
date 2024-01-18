package Searching;

/* given 1 based indexing array find position of two elements that sum up to target */
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 18;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;
        while (start < end) {
            int ans = numbers[start] + numbers[end];
            if (ans == target) {
                return new int[] { start + 1, end + 1 };
            } else if (ans > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[] { start + 1, end + 1 };
    }

}
