package Patterns;

public class Triangles {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("------------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------------------");
        for (int i = 0; i < n; i++) {
            char key = 'E';
            for (int j = 0; j < n - i; j++) {
                System.out.print((char) (key - i - j) + " ");
            }
            System.out.println();
        }
        System.out.println("------------------");
        boolean isUpperCase = false;
        char value = 'a';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((isUpperCase ? Character.toUpperCase(value) : value) + " ");
                isUpperCase = isUpperCase ^ true;
                value++;
            }
            System.err.println();
        }
        System.out.println("------------------");
    }
}
