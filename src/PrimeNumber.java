public class PrimeNumber {
    /** To check if a number is a prime number. */
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(5));
        System.out.println(isPrime(-1));
        System.out.println(isPrime(6));
        System.out.println(isPrime(522398457));
    }
}
