package Conditional_Loops;
import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = in.nextInt();
        in.close(); 
        int sum = 1;
        int i = 2, n = num;
        while (num>0 && i<num) {
            if(num%i==0){
                sum = sum + i;
                i++;
            }
            else{
                i++;
            }
        }
        System.out.println(n+" is"+ ((sum==n) ? " a perfect number" 
        : " not a perfect number"));
    }
}
