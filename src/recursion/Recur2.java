package recursion;

import java.util.ArrayList;

public class Recur2 {
    public static void main(String[] args) {
        System.out.println(Recur2.find(new int[]{1, 2, 3, 4, 18, 18}, 18, 0));
    }

    public static boolean linearSearch(int[] a, int target, int index) {
        if (index > a.length) {
            return false;
        }
        return a[index] == target || linearSearch(a, target, index + 1);
    }

    // find index with multiple occurences
    static ArrayList<Integer> find(int[] a, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == a.length) {
            return list;
        }
        if (a[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = find(a, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }

    
}
