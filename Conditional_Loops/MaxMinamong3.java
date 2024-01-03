package Conditional_Loops;
import java.util.Scanner;

public class MaxMinamong3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 number : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        in.close();
        System.out.println("Maximum = "+ maximum(a,b,c));
        System.out.println("Minimum = "+ minimum(a,b,c));
    }
    static int maximum(int a, int b, int c){
        if (a>b && a>c) return a;
        else if (b>a && b>c) return b;
        else return c;
    }
    static int minimum(int a, int b, int c){
        if (a<b && a<c) return a;
        else if (b<a && b<c) return b;
        else return c;
    }
}
