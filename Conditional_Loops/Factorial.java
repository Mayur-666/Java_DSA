package Conditional_Loops;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = in.nextInt();
        in.close();
        System.out.println("Factorial of "+num+" is "+ factorial(num));
    }

    static int factorial(int num){
        if (num==0 || num ==1 ) return 1;
        return num*factorial(num-1);
    }
}
