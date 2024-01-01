package First_Java;
import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int fnum = in.nextInt();
        System.out.print("Enter second number : ");
        int snum = in.nextInt();
        in.close();
        System.out.println((fnum > snum) ? (fnum +" is grater than "+ snum)
        : (snum +" is greater than "+ fnum)); 
    }
}
