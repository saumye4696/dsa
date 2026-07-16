package leetcode;

public class StringCompression {
    public int compress(char[] chars) {
        int k = 0;
        String s = String.valueOf(chars[0]);
        int count = 1;
        if (chars.length == 1)
            return 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == s.charAt(k)) {
                count++;
//                k++;
            } else {
                s += String.valueOf(chars[i]);
                s += String.valueOf(count);
                k+=1;
                count = 1;
            }
        }
        System.out.println(s);
//        System.out.println("count::::: " + count);
        return s.length();
    }

    public static void main(String[] args) {
        new StringCompression().compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'});
    }
}
