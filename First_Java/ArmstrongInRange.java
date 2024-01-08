package First_Java;

import java.util.Scanner;

public class ArmstrongInRange {
    public static void main(String[] args) {

        // taking input numbers
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int firstNum = in.nextInt();
        System.out.print("Enter second number : ");
        int secondNum = in.nextInt();
        in.close();

        // checking for bigger number
        if (firstNum <= secondNum) {
            printArmstrong(firstNum, secondNum);
        } else {
            printArmstrong(secondNum, firstNum);
        }
    }

    // methon to find armstrong nymber
    public static void printArmstrong(int fNum, int sNum) {
        for (int i = fNum; i < sNum; i++) {
            int num = i;
            int sum = 0;
            while (num > 0) {
                int rem = num % 10;
                num = num / 10;
                sum += (rem * rem * rem);
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
