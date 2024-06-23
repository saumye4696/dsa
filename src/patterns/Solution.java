package patterns;

import java.util.*;

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
        for (int x : a)
            integerSet.add(x);
        if (integerSet.size() > 2) {
//            int[] ints = Arrays.asList(a).stream().sorted(Collections.reverseOrder()).distinskip(2).limit(1).findFirst().get();
        }
        if (integerSet.size() == 1) {

        }
        return i;
    }

    static String removeStars(String s) {
        Stack stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*') {
                stack.push(s.charAt(i));
            } else {
                stack.pop();
            }
        }
        System.out.println(stack.toString());
        String f = "";
        int i = 0;
        while (i <= stack.size()) {
            f += stack.pop().toString();
            i++;
        }
        System.out.println(f);
        return f;


//        return stack.stream().map(x -> x.toString()).collect(Collectors.joining(""));
    }

    public int[] asteroidCollision(int[] asteroids) {
        int a = asteroids[0];
        int b = asteroids[1];
        int[] answer = new int[asteroids.length];
        int k = 0;
        for (int i = 0; i < asteroids.length; i++) {
            if (!checkSignSameOrNot(a, b)) { // true when sign is the same
                answer[k] = whichIsBigger(a, b);
                k++;
            }
        }
        return answer;
    }

    private static int whichIsBigger(int a, int b) {
        if (Math.abs(a) > Math.abs(b))
            return a;
        else if (Math.abs(a) < Math.abs(b))
            return b;
        else
            return 0;
    }

    private static boolean checkSignSameOrNot(int a, int b) {
        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        new Solution().thirdMax(new int[]{1, 2, 2, 3, 4, 5});
    }
}