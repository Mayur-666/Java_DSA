package Searching;

/* -------------------------------------------------------------------------- */
/*                  find smallest number greater than target                  */
/* -------------------------------------------------------------------------- */
public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 6, 7, 8, 9, 12, 15, 16, 19, 20 };
        int target = 19;

        int ceiling = binarySearch(arr, target);
        if (ceiling == -1 || ceiling >= arr.length) {
            System.out.println("Not found.");
        } else {
            System.out.println("Ceiling of " + target + " is " + arr[ceiling]);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}