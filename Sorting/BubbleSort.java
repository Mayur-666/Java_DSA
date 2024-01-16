package Sorting;

import java.util.Arrays;

/* -------------------------------------------------------------------------- */
/*                       sort an array using bubble sort                      */
/*                    time complexity O(N^2)  in worst case                   */
/* -------------------------------------------------------------------------- */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 2, 1, 0, 5, 9, 7, 3, 8 };
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr) {
        boolean swap;
        for (int i = 0; i < arr.length; i++) {
            swap = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
