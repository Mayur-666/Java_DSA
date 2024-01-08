package array;

import java.util.ArrayList;
import java.util.List;

public class MaxCandies {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        List<Boolean> arr = new ArrayList<Boolean>(candies.length);

        for (int i : candies) {
            if (max < i)
                max = i;
        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                arr.add(true);
            } else {
                arr.add(false);
            }
        }
        return arr;
    }
}
