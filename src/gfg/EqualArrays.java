package gfg;

import java.util.HashMap;

public class EqualArrays {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here

        if (a.length != b.length) return false;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }

        int count = 0;

        for (int i = 0; i < b.length; i++) {
            if (!map.containsKey(b[i])) return false;

            if (map.get(b[i]) == 0) return false;

            count = map.get(b[i]);
            --count;
            map.put(b[i], count);
        }

        return true;
    }
}
