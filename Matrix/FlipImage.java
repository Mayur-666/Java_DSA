package Matrix;

import java.util.Arrays;

// flip each row of matrix and invert each value in it
// that is from 0 to 1 and vice versa
class FlipImage {
    public static void main(String[] args) {
        int[][] mat = { { 1, 1, 0 },
                { 1, 0, 1 },
                { 0, 0, 0 } };

        for (int[] i : mat) {
            int n = i.length;
            for (int j = 0; j < (n + 1) / 2; j++) {
                int temp = i[j] == 0 ? 1 : 0;
                i[j] = i[n - j - 1] == 0 ? 1 : 0;
                i[n - j - 1] = temp;
            }
        }

        for (int[] i : mat) {
            System.out.println(Arrays.toString(i));
        }
    }
}