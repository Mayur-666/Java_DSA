package BitwiseOperators;

/* -------------------------------------------------------------------------- */
/*            every element appears twice except one, find that one           */
/* -------------------------------------------------------------------------- */
public class UniqueNum {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 2, 3, 5, 6, 8, 6, 5, 8 };

        int ans = 0;
        for (int i : arr) {
            ans ^= i; // since xor of two same number is 0 thus we'll left with
                      // the number with only one occurence.
        }
        System.out.println(ans);
    }
}
