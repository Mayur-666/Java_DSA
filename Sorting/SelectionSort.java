package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 2, 1, 0, 5, 9, 7, 3, 8 };
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = maxNum(arr, 0, last);
            swap(arr, last, max);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int maxNum(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
