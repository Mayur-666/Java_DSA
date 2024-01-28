package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDig(1456));
    }

    public static int sumOfDig(int n) {
        if (n % 10 == n) {
            return n;
        }
        return n % 10 + sumOfDig(n / 10);
    }
}
