package Conditional_Loops;

import java.util.ArrayList;
import java.util.Scanner;

// Nsum = sum of negative numbers from all inputs
// POsum = sum of odd positive numbers from all inputs
// PEsum = sum of even positive numbers from all inputs
public class NPEPOsum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int Nsum = 0, POsum = 0, PEsum = 0;

        System.out.println("Enter numbers : ");
        while (true) {
            int num = in.nextInt();
            if (num == 0)
                break;
            nums.add(num);
        }
        in.close();
        for (Integer num : nums) {
            if (num < 0)
                Nsum += num;
            else if (num % 2 == 0)
                PEsum += num;
            else
                POsum += num;
        }
        System.out.println("Negative no. sum = " + Nsum);
        System.out.println("Positive even no. sum = " + PEsum);
        System.out.println("Positive odd no. sum = " + POsum);
    }
}
