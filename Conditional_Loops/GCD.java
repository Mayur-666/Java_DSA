package Conditional_Loops;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = in.nextInt();
        System.out.print("Enter second number : ");
        int b = in.nextInt();
        in.close();
        int hcf = 0;
        for (int i = 1; i<a || i<b; i++) {
            if (a%i==0 && b%i==0) {
                hcf = i;
            }
        }
        System.out.printf("Hcf of %d and %d is %d.",a,b,hcf);
    }
}
