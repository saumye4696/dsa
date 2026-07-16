package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaxNumberOfKSumPairs {
    public int maxOperations(int[] nums, int k) {
        List<Integer> list = IntStream.of(nums).boxed().collect(Collectors.toList());
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size(); j++) {
                if (list.get(j) == k - list.get(i) && i != j) {
                    list.remove(Math.max(i, j));
                    list.remove(Math.min(i, j));
                    count++;
                    i = 0;
                    j = 0;
                    System.out.println(Arrays.toString(list.toArray()));
                }
            }
//            break;
        }
        System.out.println(count);
        return 0;
    }

    public static void main(String[] args) {
        new MaxNumberOfKSumPairs().maxOperations(new int[]{4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4}, 2);
    }
}
