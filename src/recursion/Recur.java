package recursion;

public class Recur {
    public static void main(String[] args) {
        System.out.println("factorial is: " + factorial(5));
        System.out.println("sum of digits is: " + sumOfDigits(23412));
        System.out.println("reverse of number is: " + reverseNumber(6789));
    }

    static int factorial(int n) {
        int p = 1;
        if (n <= 1)
            return 1;
        return n * factorial(n - 1);
    }

    static int sumOfDigits(int n) {
        int sum = 0;
        if (n < 1)
            return 0;
        int d = n % 10;
        return d + sumOfDigits(n / 10);
    }

    static int rev = 0;
    static int d = 0;

    static int reverseNumber(int n) {
        if (n <= 0)
            return rev;
        d = n % 10;
        rev = rev * 10 + d;
        return reverseNumber(n / 10);
    }
}
