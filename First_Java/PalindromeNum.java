package First_Java;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = in.nextInt();
        int temp = num, newNum = 0;

        // reversing the number
        while (temp > 0) {
            int rem = temp % 10;
            temp = temp / 10;
            newNum = newNum * 10 + rem;
        }
        in.close();
        System.out.println(newNum == num ? "Number is palindrome."
                : "Number is not palindrome.");
    }
}