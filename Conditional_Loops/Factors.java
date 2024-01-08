package Conditional_Loops;

import java.util.ArrayList;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = in.nextInt();
        in.close();
        pfactors(num);
    }

    static void pfactors(int n) {
        if (n == 0 || n == 1) {
            System.out.println("Factor = " + n);
        }
        int num = n;
        int i = 2;
        ArrayList<Integer> arr = new ArrayList<>(10);
        System.out.print("Printing factors :");

        while (num > 0 && i <= n) {
            if (num % i == 0) {
                // can also directly print factors rather than storing
                arr.add(i);
                num /= i;
            } else {
                i++;
            }
        }
        System.out.println(arr);
    }
}
