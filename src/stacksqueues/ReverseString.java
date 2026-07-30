package stacksqueues;

import java.util.Stack;

public class ReverseString {
    static String reverse(String s) {
        Stack<Character> stringStack  = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            stringStack.push(s.charAt(i));
        }

        System.out.println(stringStack);

        StringBuilder sb = new StringBuilder();
        while (!stringStack.isEmpty()) {
            sb.append(stringStack.pop());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        reverse("saumye");
    }
}
