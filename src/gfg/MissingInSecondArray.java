package gfg;

import java.util.*;

public class MissingInSecondArray {
    static ArrayList<Integer> findMissing(int[] a, int[] b) {
        // code here
        Map<Integer, Integer> m = new HashMap<>();
        ArrayList<Integer> l = new ArrayList<>();
        for (int i: b) {
            if (m.get(i) == null) {
                m.put(i, 0);
            }
        }

        for (int i: a) {
            if (m.get(i) == null) {
                l.add(i);
            }
        }

        return l;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 10};
        int[] b = new int[]{2, 3, 1, 0, 5};
        ArrayList<Integer> missing = MissingInSecondArray.findMissing(a, b);
        System.out.println(missing);
    }

}
