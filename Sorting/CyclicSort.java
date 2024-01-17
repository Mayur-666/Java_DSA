package Sorting;

import java.util.Arrays;

/* -------------------------------------------------------------------------- */
/*          only works when all elements of array are in range [0, n]         */
/* -------------------------------------------------------------------------- */
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 6, 4, 2, 3, 1, 7, 0, 8, 5, 10, 9, 11, 15, 12, 13, 14 };
        System.out.println(Arrays.toString(cyclicSort(arr)));
    }

    public static int[] cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] != arr[correctIndex]) {
                // swap
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
        return arr;
    }
}
