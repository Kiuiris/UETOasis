public class Fraction {
    private int numerator;
    private int denominator = 1;

    /** setter for numerator. */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /** getter for numerator. */
    public int getNumerator() {
        return numerator;
    }

    /** setter for denominator. */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    /** getter for denominator. */
    public int getDenominator() {
        return denominator;
    }

    /** Constructor. */
    public Fraction(int numerator, int denominator) {
        this.setNumerator(numerator);
        this.setDenominator(denominator);
    }

    /** the GCD method. */
    public int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    /** reduce method. */
    public Fraction reduce() {
        int divisor = gcd(numerator, denominator);
        if (divisor == 1) {
            return this;
        }
        int num = this.numerator / divisor;
        int den = this.denominator / divisor;
        if (den < 0) {
            den = - den;
            num = - num;
        }
        Fraction newF = new Fraction(num, den);
        return newF;
    }

    /** add 2 fractions. */
    public Fraction add(Fraction s) {
        int num = this.numerator * s.denominator + this.denominator * s.numerator;
        int den = this.denominator * s.denominator;
        Fraction newF = new Fraction(num, den);
        return newF.reduce();
    }

    /** subtract 2 fractions. */
    public Fraction subtract(Fraction s) {
        int num = this.numerator * s.denominator - this.denominator * s.numerator;
        int den = this.denominator * s.denominator;
        Fraction newF = new Fraction(num, den);
        return newF.reduce();
    }

    /** multiply 2 fractions. */
    public Fraction multiply(Fraction s) {
        int num = this.numerator * s.numerator;
        int den = this.denominator * s.denominator;
        Fraction newF = new Fraction(num, den);
        return newF.reduce();
    }

    /** divide 2 fractions. */
    public Fraction divide(Fraction s) {
        if (s.numerator * s.denominator == 0) {
            return this;
        }
        int num = this.numerator * s.denominator;
        int den = this.denominator * s.numerator;
        Fraction newF = new Fraction(num, den);
        return newF.reduce();
    }

    /** comparing 2 objects. */
    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            Fraction other = (Fraction) obj;
            other = other.subtract(this);
            if (other.numerator == 0 && other.denominator == 1) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public void printFraction() {
        System.out.println(this.numerator + "/" + this.denominator);
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(4, 6);
        Fraction f2 = new Fraction(2, 3);
        Fraction f3 = new Fraction(1, 2);

        System.out.println(f1.equals(f2));
        System.out.println(f1.equals(f3));

        f1.reduce().printFraction();
        f1.add(f2).printFraction();
        f3.subtract(f1).printFraction();
        f1.multiply(f2).printFraction();
        f3.divide(f2).printFraction();
    }
}
