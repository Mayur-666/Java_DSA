package Conditional_Loops;

import java.util.Scanner;

public class MaxMinSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers (0 for exit) : ");

        // finding minimum, maximum among all input numbers and their sum
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0;
        while (true) {
            int num = in.nextInt();
            if (num == 0)
                break;
            sum += num;
            if (max < num)
                max = num;
            if (min > num)
                min = num;
        }
        in.close();
        System.out.println("Max = " + max + ", Min = " + min + ", Sum = " + sum);
    }
}
