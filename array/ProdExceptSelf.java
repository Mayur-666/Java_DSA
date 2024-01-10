package array;

import java.util.Arrays;

// product of all elements in array except self
public class ProdExceptSelf {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 1, 2 };
        int n = arr.length;
        int[] ans = new int[n];
        int prod = 1;

        for (int i = 0; i < n; i++) {
            ans[i] = prod;
            prod *= arr[i];
        }
        prod = 1;
        for (int i = n - 1; i > -1; i--) {
            ans[i] *= prod;
            prod *= arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
