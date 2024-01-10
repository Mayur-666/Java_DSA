package Matrix;

//print sum of both diagonals of given matrix
//odd matrix have one common element
public class DiagonalSum {
    public static void main(String[] args) {
        int[][] mat = { { 2, 2, 2 }, { 1, 1, 1 }, { 3, 3, 3 } };
        int n = mat.length;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i] + mat[i][n - i - 1];
        }
        System.out.println((n % 2 == 0) ? sum : sum - mat[n / 2][n / 2]);
    }
}
