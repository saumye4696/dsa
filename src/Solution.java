import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int thirdMax(int[] a) {
        Set<Integer> integerSet = new HashSet<>();
        int i = 0;
        int[] ints = new int[a.length];
        System.out.println(Arrays.toString(a));
        if (a.length > 2) {
            ints = Arrays.asList(a).stream().sorted(Collections.reverseOrder()).distinct().skip(2).findFirst().get();
        }
        System.out.println(Arrays.toString(ints));
        for (int x: a)
            integerSet.add(x);
        if (integerSet.size() > 2) {
//            int[] ints = Arrays.asList(a).stream().sorted(Collections.reverseOrder()).distinskip(2).limit(1).findFirst().get();
        }
        if (integerSet.size() == 1) {

        }
        return i;
    }

    public static void main(String[] args) {
        new Solution().thirdMax(new int[]{1,2,2,3,4,5});
    }
}