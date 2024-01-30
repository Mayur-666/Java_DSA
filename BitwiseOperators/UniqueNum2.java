package BitwiseOperators;

// every number appears n number of odd times here n=3
// find unique among them that appear only once
public class UniqueNum2 {
    public static int findUniqueNumber(int[] nums) {
        int ones = 0, twos = 0, commonBits;
        for (int num : nums) {
            twos |= (ones & num);
            ones ^= num;
            commonBits = (ones & twos);
            ones &= ~commonBits;
            twos &= ~commonBits;
        }
        return ones;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 2, 6, 1, 2, 1, 6, 6 };
        int uniqueNumber = findUniqueNumber(nums);
        System.out.println("The unique number is: " + uniqueNumber);
    }
}
