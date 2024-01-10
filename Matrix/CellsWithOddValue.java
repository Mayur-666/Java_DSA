package Matrix;

/*
 * Let a matrix "mat" is filled with 0  {0, 0, 0} 
 * of size m*n                          {0, 0, 0}
 *                                      {0, 0, 0}
 * indices => {{r, c}} 
 * for each r in indices increase value of that row in mat by 1
 * for each c in indices increase value of that col in mat by 1
 * count cells with odd values
 */

public class CellsWithOddValue {
    public static void main(String[] args) {
        int[][] indices = { { 1, 0 }, { 2, 1 } };

        int m = 3, n = 3; // size of mat
        int[] row = new int[m];
        int[] col = new int[n];
        int oddRow = 0, oddCol = 0;

        for (int[] i : indices) {
            row[i[0]]++;
            col[i[1]]++;
        }
        for (int i : row) {
            if (i % 2 != 0) {
                oddRow++;
            }
        }
        for (int i : col) {
            if (i % 2 != 0) {
                oddCol++;
            }
        }
        System.out.println("Cells with odd values : " + (oddCol * m + oddRow * n - 2 * oddCol * oddRow));
    }
}
