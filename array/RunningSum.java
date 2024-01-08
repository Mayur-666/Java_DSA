package array;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 5, 3, 4 };
        runningSum(arr);
    }

    static void runningSum(int[] num) {
        if (num.length == 1 || num.length == 0) {
            System.out.print(num);
            return;
        }
        for (int i = 1; i < num.length; i++) {
            num[i] += num[i - 1];
        }
        System.out.println(Arrays.toString(num));

    }
}
