package leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithMaxCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int currentMax = candies[0];
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > currentMax)
                currentMax = candies[i];
        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= currentMax)
                ans.add(true);
            else
                ans.add(false);
        }
        return ans;
    }
}
