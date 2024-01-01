package First_Java;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = in.nextInt();
        in.close();
        System.out.println("Entered number is " + ((num%2 == 0) ? "even." : "odd."));
    }    
}
