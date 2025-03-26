package studio7;

public class Fraction {
	private int numerator;
	private int denominator;

	public Fraction(int numerator, int denomicator) {
		if (denominator == 0) {
            System.out.println("Denominator cannot be zero.");
        }
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	private void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        if (denominator < 0) { // Ensure denominator is positive
            numerator *= -1;
            denominator *= -1;
        }
    }
	
	public static int gcd (int p, int q) {
		if (p % q == 0) {
			return q;
		} else {
			return gcd(q, p % q);
		}
	
	}
	
	public int add () {
		int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
		int newDenominator = this.denominator * other.denominator;
	}
}
