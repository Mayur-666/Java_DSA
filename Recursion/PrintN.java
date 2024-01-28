package Recursion;

//print number from N to 1 and 1 to N using recursion
class PrintN {
    public static void main(String[] args) {
        recursion(5);
    }

    static void recursion(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n + " ");
        recursion(n - 1);
        System.out.print(n + " ");
    }
}