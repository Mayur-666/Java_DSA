package First_Java;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter principal amount : ");
        int p = in.nextInt(); //principal

        System.out.print("Enter annual interest rate : ");
        int r = in.nextInt(); // rate

        System.out.print("Enter time (in years) : ");
        int t = in.nextInt(); //time
        in.close();

        float FinalAmount = p*(1 + r*t);
        System.out.println("Final amount : " + FinalAmount);
    }
}
