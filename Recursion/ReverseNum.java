package Recursion;

/* -------------------------------------------------------------------------- */
/*                          print reverse of a number                         */
/* -------------------------------------------------------------------------- */
public class ReverseNum {
    static int sum = 0;

    public static void main(String[] args) {
        reverse(12453);
        System.out.println(sum);
    }

    public static void reverse(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n / 10);
    }
}