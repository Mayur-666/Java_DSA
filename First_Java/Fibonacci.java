package First_Java;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = in.nextInt();
        System.out.println("Fibonacci numbers ");
        in.close();

        int a = 0, b = 1, c;
        System.out.print(a+ " " + b + " ");
        for (int i = 3; i <=num; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c+ " ");
        }
    }
}
