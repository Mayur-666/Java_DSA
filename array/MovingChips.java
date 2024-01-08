package array;

/*
 * find minimum cost to move chips 
 * position[i] represent position of chip i
 * moving chip from position[i] to position[i+1] or position[i-1] ==>  cost =1
 * moving chip from position[i] to position[i+2] or position[i-2] ==>  cost =0
 * position start from 0 to int's maxvalue
*/
public class MovingChips {
    public static void main(String[] args) {
        int[] position = { 2, 2, 4, 4, 1, 5 };
        int evenCount = 0, oddCount = 0;
        for (int i : position) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Minimum cost will be " + (evenCount < oddCount ? evenCount : oddCount));
    }
}
