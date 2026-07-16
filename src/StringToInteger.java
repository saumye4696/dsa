public class StringToInteger {
    public static void main(String[] args) {
        StringToInteger.stoi("-123");
    }

    public static int stoi(String s) {
        // removing trail spaces
        for (int i=0; i< s.length();i++) {
            if (s.charAt(i) != ' ') {
                s = s.substring(0, s.length());
                break;
            }
        }

        char sign = s.charAt(0);
        s = s.substring(1, s.length());
        if (s.length() == 0) {
            return 0;
        }



        return 1;
    }
}
