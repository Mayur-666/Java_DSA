package First_Java;
import java.util.Scanner;

public class PalindromeStr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String str = in.next();
        in.close();
        System.out.println(isPalindrome(str) 
        ? (str+" is palindrome string.")
        : (str+" is not palindrome string."));
        
        
    }
    static boolean isPalindrome(String str){
        int start = 0, end = str.length() -1;
        while(start < end){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
}
