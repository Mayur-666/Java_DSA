package Recursion;

public class ProdOfDigit {
    public static void main(String[] args) {
        System.out.println(prodOfDig(123));
    }

    public static int prodOfDig(int n) {
        if (n % 10 == n) {
            return n;
        }
        return n % 10 * prodOfDig(n / 10);
    }
}
