package gfg;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class NonRepeatingElement {
    public int firstNonRepeating(int[] arr) {
        // code here
        Map<Integer, Integer> m = new TreeMap<>();
        for (int i: arr) {
            if (m.get(i) == null) {
                m.put(i, 1);
            } else {
                m.put(i, m.get(i)+1);
            }
        }

        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getValue() < 2) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
