package Matrix;

import java.util.Arrays;

/* -------------------------------------------------------------------------- */
/*                       print Transpose of given Matrix                      */
/* -------------------------------------------------------------------------- */
public class Transpose {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int row = mat.length;
        int col = mat[0].length;
        
        int[][] transpose = new int [col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = mat[i][j];
            }
        }
        
        for (int[] i : transpose) {
            System.out.println(Arrays.toString(i));
        }
    }
}
