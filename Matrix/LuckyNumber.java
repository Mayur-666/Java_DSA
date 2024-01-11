package Matrix;

import java.util.ArrayList;

/**
 * LuckyNumber -> max in its column but min in its row
 */
public class LuckyNumber {
    public static void main(String[] args) {
        int[][] mat = {{3,7,8},{8,11,13},{15,16,17}};
        int n = mat.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int minIndex = indexOfMininRow(mat[i]);
            int minValue = mat[i][minIndex];
            boolean lucky = true;
            for (int j = 0; j < n; j++) {
                if (mat[j][minIndex] > minValue) {
                    lucky = false;
                    break;
                }
            }
            if (lucky) {
                ans.add(minValue);
            }
        }
        System.out.println(ans);
    }

    private static int indexOfMininRow(int[] row) {
        int minIndex = 0;
        for (int i = 1; i < row.length; i++) {
            if (row[i] < row[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}