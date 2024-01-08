package Conditional_Loops;

import java.util.Scanner;

//different ways to reverse a string in java
//charAt        StringBuffer
//StringBuilder toCharArray 

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String str = in.nextLine();
        in.close();

        System.out.println("Printing reverse of string using \n");
        System.out.println("1. charAt() = " + Char_At(str));
        System.out.println("2. StringBuilder() = " + String_Builder(str));
        System.out.println("3. toCharArray() = " + To_Char_Array(str));
        System.out.println("4. StringBuffer() = " + String_Buffer(str));

    }

    static String Char_At(String str) {
        String revStr = "";
        for (int i = 0; i < str.length(); i++) {
            revStr = str.charAt(i) + revStr;
        }
        return revStr;
    }

    static String String_Builder(String str) {
        StringBuilder revStr = new StringBuilder(str);
        return revStr.reverse().toString();
    }

    static String To_Char_Array(String str) {
        char[] arr = str.toCharArray();
        String revStr = "";
        for (char c : arr) {
            revStr = c + revStr;
        }
        return revStr;
    }

    static String String_Buffer(String str) {
        StringBuffer revStr = new StringBuffer(str);
        return revStr.reverse().toString();
    }
}
