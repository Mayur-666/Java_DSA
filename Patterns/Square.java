package Patterns;

public class Square {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("----------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("----------------");
        for (int i = 0; i <= 2 * n; i++) {
            for (int j = 0; j <= 2 * n; j++) {
                // int min = Math.min(Math.min(i, j), Math.min(2 * n - 2 - i, 2 * n - 2 - j));
                // System.out.print(min + " ");
                // System.out.print(Math.max(0, Math.min(i, 2 * n - 2 - i)) + " ");
                System.out.print(n - Math.min(Math.min(i, j), Math.min(2 * n - i, 2 * n - j)) + " ");

            }
            System.out.println();
        }
        System.out.println("----------------");
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int key = Math.min(Math.min(i, j), Math.min(2 * n - 2 - i, 2 * n - 2 - j));
                System.out.print(n - key + " ");
            }
            System.out.println();
        }
        System.out.println("----------------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}