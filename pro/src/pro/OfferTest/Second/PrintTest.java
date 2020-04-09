package pro.OfferTest.Second;

public class PrintTest {
	/*
	 * public static void printT(int n) { int number = 1; int i = 0; while (i++ < n)
	 * { number *= 10; } for (i = 1; i < number; i++) { System.out.println(i +
	 * "--"); } }
	 */

	public static void Max(int n) {
		if (n <= 0) {
			return ;
		}
		char[] num = new char[n];
		for (int i = 0; i < 10; i++) {
			num[0] = (char) (i + '0');
			printNumRece(num, n, 0);
		}
	}

	public static void printNumRece(char[] num, int n, int index) {
		if (index == n - 1) {
			printNum(num);
			return;
		}
		for (int i = 1; i < 10; i++) {
			num[index + 1] = (char) (i + '0');
			printNumRece(num, n, index + 1);
		}

	}

	public static void printNum(char[] num) {
		boolean isBegin0 = true;
		for (int i = 0; i < num.length; i++) {
			if (isBegin0 && num[i] != '0') {
				isBegin0 = false;
			}
			if (!isBegin0) {
				System.out.print(num[i]);
			}

		}
	}

	public static void main(String[] args) {
		Max(0);
	}

}
