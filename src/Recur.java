public class Recur {
    public static void main(String[] args) {
        System.out.println("factorial is: " + factorial(5));
        System.out.println("sum of digits is: " + sumOfDigits(23412));
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

    static void reverseNumber(int n) {


    }
}
