package Conditional_Loops;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year : ");
        int num = in.nextInt();
        in.close(); 

        if(num%400==0){
            System.err.println(num+" is leap year.");
        } else if (num%4==0 && num%100!=0){
            System.out.println(num+" is a leap year.");
        } else{
            System.out.println(num+" is not a leap year.");
        }
    }
}
