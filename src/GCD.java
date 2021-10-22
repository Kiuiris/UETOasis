public class GCD {
    /** finding greatest common divisor. */
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    public static void main(String[] args) {
        System.out.println(gcd(10, 15));
        System.out.println(gcd(44, 52));
        System.out.println(gcd(-14, 28));
    }
}
