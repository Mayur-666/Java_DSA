package Searching;

import java.util.Scanner;

/* -------------------------------------------------------------------------- */
/*             finding square root of a number using binary search            */
/*                       Time complexity -> O(log N)                          */
/* -------------------------------------------------------------------------- */
public class SquareRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        input.close(); // closing the scanner

        if (n == 0 || n == 1) {
            System.out.println(n);
            return;
        } else if (n < 0) {
            return;
        }
        System.out.println(findSquareRoot(n));
    }

    public static int findSquareRoot(int n) {
        int low = 0, high = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid == n) {
                return mid;
            } else if ((long) mid * mid < (long) n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
}
