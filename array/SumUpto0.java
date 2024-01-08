package array;

import java.util.Arrays;

//create an array of n unique integer that sum upto 0
public class SumUpto0 {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = new int[n];
        int N = n / 2, i = 0;

        if (n % 2 != 0) {
            arr[i] = 0;
            i++;
        }
        while (i < n) {
            arr[i++] = N;
            arr[i++] = N * (-1);
            N--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
