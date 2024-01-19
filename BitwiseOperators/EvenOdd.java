package BitwiseOperators;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = input.nextInt();
        input.close();

        System.out.println((num & 1) == 1 ? "Odd" : "Even");
    }
}
