package Conditional_Loops;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any character : ");
        char c = in.next().charAt(0);
        in.close();

        // checking for vowels both lower and upper case
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            System.out.println(c + " is vowel.");
        } else {
            System.out.println(c + " is consonant.");
        }
    }
}
