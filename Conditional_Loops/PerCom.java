package Conditional_Loops;
import java.util.Scanner;

//find nPr and nCr that is permutation and
// combination of given number 
public class PerCom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = in.nextInt();
        System.out.print("Enter value of r : ");
        int r = in.nextInt();
        in.close(); 
        System.out.println("nPr = "+Permutation(n,r));
        System.out.println("nCr = "+Combination(n,r));
    }
    static int Permutation(int n, int r){
        int factN = Factorial(n);
        int factN_R = Factorial(n-r);
        int permutation = factN/factN_R;
        return permutation;
    }
    static int Combination(int n, int r){
        int factN = Factorial(n);
        int factR = Factorial(r);
        int factN_R = Factorial(n-r);
        int combination = (factN/factR)/factN_R;
        return combination;
    }
    static int Factorial(int num){
        if (num==0 || num==1) return 1;
        return num*Factorial(num-1);
    }
}
