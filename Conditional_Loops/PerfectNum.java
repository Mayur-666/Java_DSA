package Conditional_Loops;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = in.nextInt();
        in.close();
        int sum = 1, i = 2;
        /*
         * number is perfect if sum of all factors of
         * it is equal to the number itself
         */
        while (num > 0 && i < num) {
            if (num % i == 0) {
                sum = sum + i;
                i++;
            } else {
                i++;
            }
        }
        System.out.println(num + " is" + ((sum == num) ? " a perfect number"
                : " not a perfect number"));
    }
}
