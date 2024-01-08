package array;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = { 12, 14344, 13122, 3, 4, 3, 53, 87, 97, 78, 7 };
        int count = 0;
        for (int i : nums) {
            if ((int) (Math.log10(i) + 1) % 2 == 0) {
                count++;
            }
        }
        System.out.println("Numbers with even number of digits : " + count);
        System.out.println("Numbers with odd number of digits : " + (nums.length - count));
    }
}
