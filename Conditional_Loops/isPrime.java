package Conditional_Loops;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = in.nextInt();
        in.close();
        System.out.println(findPrime(num) ? "Prime" : "Not prime");
    }

    static boolean findPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
