package Conditional_Loops;
import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = in.nextInt();
        in.close();  
        System.out.println((findPrime(num)==1) ? "Prime" : "Not prime");
    }
    static int findPrime(int n){
        int i = 2;
        if (n==0 || n==1) {
            return -1;
        }
        while (i<n){
            if (n%i==0){
                return -1;
            }
            i++;
        }
        return 1;
    }
}
