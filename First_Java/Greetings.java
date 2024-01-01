package First_Java;
import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = in.next();
        in.close();
        System.out.println("Hello! "+name+".");
    }
}
