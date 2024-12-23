package leetcode;

public class MergeAlternately {
    public String mergeAlternately(String word1, String word2) {
        int k = 0;
        int l = word1.length() > word2.length() ? word1.length() : word2.length();
        String ans = "";
        for (int i = 0; i < l; i++) {
            if (k < word1.length())
                ans += word1.charAt(k);

            if (k < word2.length())
                ans += word2.charAt(k);

            k++;
        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        new MergeAlternately().mergeAlternately("abc", "io");
    }
}
