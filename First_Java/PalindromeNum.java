package First_Java;
import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = in.nextInt();
        int temp = num;
        int newNum = 0;
        int len = ((Integer) temp).toString().length();

        while (temp>0){
            int rem = temp%10;
            temp = temp/10;
            newNum += rem*(Math.pow(10, len-1));
            len--;
        }
        in.close();
        System.out.println(newNum==num ? "Number is palindrome" 
        : "Number is not palindrome");
    }
}