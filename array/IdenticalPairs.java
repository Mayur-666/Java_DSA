package array;

public class IdenticalPairs {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 2, 1, 1, 1, 2, 3 };
        System.out.println(numOfIdenticalPairs(nums));
    }

    // identical pairs nums[i]==nums[j] for i<j
    public static int numOfIdenticalPairs(int[] nums) {
        int ans = 0;
        int[] count = new int[101];
        for (int i : nums) {
            ans += count[i]++;
        }
        return ans;
    }
}
