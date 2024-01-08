package Conditional_Loops;

import java.util.Scanner;

//return digitProd-digitSum where digitProd is product of 
// digit and digitSum is sum of digit of number

public class ProdSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = in.nextInt();
        in.close();
        int digitProd = 1, digitSum = 0;
        while (num > 0) {
            int rem = num % 10;
            digitProd = digitProd * rem;
            digitSum = digitSum + rem;
            num /= 10;
        }
        System.out.println(digitProd - digitSum);
    }
}
