public class Fibonacci {
    /** fibonacci number. */
    public static long fibonacci(long n) {
        long f0 = 0;
        long f1 = 1;

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n < 0) {
            return -1;
        } else if (n >= 93) {
            return Long.MAX_VALUE;
        } else {
            long f = 0;
            for (int i = 2; i <= n; i++) {
                f = f0 + f1;
                f0 = f1;
                f1 = f;
            }
            return f;
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(10));
        System.out.println(fibonacci(15));
        System.out.println(fibonacci(93));
    }
}
