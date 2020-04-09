package pro.OfferTest.Second;

public class PowTest {
	public static double Power(double base, int exponent) {
		double result = 1.0;
		if (exponent <= 0) {

			base = 1 / base;
			for (int i = 1; i <= -exponent; i++) {
				result *= base;

			}
			if (exponent == 0) {
				result = 1;
			}
			return result;

		}
		if (base == 0) {
			return 0;
		}

		for (int i = 1; i <= exponent; i++) {
			result *= base;

		}
		return result;

	}

	public static double PowerWith(double base, int exponent) {
		if (exponent == 0) {
			return 1.0;
		}
		if (exponent < 0) {
			return 1.0 / (base * PowerWith(base, -exponent - 1));
		}
		double result = PowerWith(base, exponent >> 1);
		result *= result;
		if ((exponent & 1) == 1) {
			result *= base;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Power(2, -2));
		System.out.println(PowerWith(2, -2));

	}

}
