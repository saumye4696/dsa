package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 345
public class ReverseVowelsInString {
    public String reverseVowels(String s) {
        List<Character> c = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                c.add(s.charAt(i));
            }
        }
        Collections.reverse(c);
        String s2 = "";
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                s2 += c.get(k++);
            } else
                s2 += s.charAt(i);
        }

        return s2;
    }

    private boolean isVowel(char ch) {
        String s = "aeiouAEIOU";
        return s.indexOf(ch) != -1;
    }
}
