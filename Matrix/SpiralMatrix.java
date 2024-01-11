package Matrix;

import java.util.ArrayList;

/* -------------------------------------------------------------------------- */
/*         traverse the matrix in spiral form and add it to ArrayList         */
/* -------------------------------------------------------------------------- */
public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = mat.length, m = mat[0].length;
        ArrayList<Integer> ans = new ArrayList<>();

        if(mat==null || n==0){
            System.out.println(-1); 
            return;
        }
        int left = 0, right = m - 1, top = 0, bottom = n - 1;
        while (left<=right && top<=bottom) {
            for (int i = left; i <=right ; i++) {
                ans.add(mat[top][i]);
            }
            top++;
            for (int i = top; i <=bottom; i++) {
                ans.add(mat[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    ans.add(mat[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    ans.add(mat[i][left]);
                }
                left++;
            }
        }
        System.out.println(ans);
    }
}
