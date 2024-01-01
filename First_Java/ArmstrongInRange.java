package First_Java;
import java.util.Scanner;

public class ArmstrongInRange {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int fnum = in.nextInt();
        System.out.print("Enter second number : ");
        int snum = in.nextInt();
        in.close();

        if (fnum <= snum){
            for (int i = fnum; i < snum; i++) {
                int num = i;
                int sum = 0;
                while(num>0){
                    int rem = num%10;
                    num = num/10;
                    sum += (rem*rem*rem);
                }
                if(sum == i){
                    System.out.println(i);
                }
            }
        } else {
            for (int i = snum; i < fnum; i++) {
                int num = i;
                int sum = 0;
                while(num>0){
                    int rem = num%10;
                    num = num/10;
                    sum += (rem*rem*rem);
                }
                if(sum == i){
                    System.out.println(i);
                }
            }
        }
    }
}
