package leetcode;

// same question but using two pointers this time
// 345
public class ReverseVowelsInString2 {
    public String reverseVowels(String s) {
        int k = 0;
        int l = s.length() - 1;

        while (k <= l) {
            if (isVowel(s.charAt(k)) && isVowel(s.charAt(l))) {
                swap2(s, k, l);
                k++;
                l--;
            } else if (isVowel(s.charAt(k)) && !isVowel(s.charAt(l))) {
                l--;
            } else {
                k++;
            }
        }
        return "";
    }

    private void swap2(String s, int k, int l) {

    }

    private boolean isVowel(char ch) {
        String s = "aeiouAEIOU";
        return s.indexOf(ch) != -1;
    }

    private String swap() {
        return "";
    }
}
