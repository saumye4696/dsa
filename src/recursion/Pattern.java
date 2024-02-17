package recursion;

public class Pattern {
    public static void main(String[] args) {
        Pattern.pat2(5, 5);
    }

    static void pat1() {
        int r = 5;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("$");
            }
            System.out.println();
        }
    }

    static void pat2(int r, int c) {
        for (int i = 0; i < r; i++) {
            System.out.print("^");
            pat2(r-1, c-1);
        }
    }


}


/*


70 lakh - tax ,
20l 50l

NPS -
tax free mutual funds
sip

*/


/*
*
* 3sweatshirt
* 2 jacket black blue
* belt
* 2pyjama 2t-shirts
*
* xsssedx
*
* */