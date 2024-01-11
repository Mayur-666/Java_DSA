package Matrix;

import java.util.Arrays;

/* -------------------------------------------------------------------------- */
/*             fill values from 1 to n^2 in matrix in spiral order            */
/* -------------------------------------------------------------------------- */
public class FillSpiralMatrix {
    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = new int[n][n];
        int num = 1;
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        while (left<=right && top<= bottom) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                matrix[i][right]= num++;
            }
            right--;
            if(top<=bottom){
                for (int i = right; i>=left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }
            if(left<=right){
                for (int i = bottom; i>=top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }
        for (int[] i : matrix) {
            System.out.println(Arrays.toString(i));
        }
    }
}
