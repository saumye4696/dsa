package gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrequenciesInLimitedArray {
    public List<Integer> frequencyCount(int[] arr) {
        int k = 1;
        int count = 0;
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == k)
                    count++;
            }
            ans.add(count);
            count = 0;
            k++;
        }

        return ans;
    }
}
