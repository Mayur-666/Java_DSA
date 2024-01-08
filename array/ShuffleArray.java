package array;
// arr = [x1, x2, x3 --- xn, y1, y2, y3 ---- yn]

// shuffle it to [x1, y1, x2, y2, x3, y3 ---------xn, yn]

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 5, 3, 4 }; // output {0,5,2,3,1,4}
        int n = 3;

        int[] shuffledArray = new int[n * 2];
        int j = 0;
        for (int i = 0; i < n; i++) {
            shuffledArray[j] = arr[i];
            shuffledArray[j + 1] = arr[i + n];
            j += 2;
        }

        System.out.println(Arrays.toString(shuffledArray));
    }
}
