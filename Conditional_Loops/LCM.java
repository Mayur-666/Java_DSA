package Conditional_Loops;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = in.nextInt();
        System.out.print("Enter second number : ");
        int b = in.nextInt();
        in.close();
        int lcm = Math.max(a, b);

        System.out.printf("Lcm of %d and %d is ", a, b );
        while (true) {
            if( lcm%a==0 && lcm%b==0 ){
                System.out.print(lcm);
                break;
            }
            lcm++;
        }
    }
}
