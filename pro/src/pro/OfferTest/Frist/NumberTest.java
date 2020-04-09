package pro.OfferTest.Frist;

public class NumberTest {
	public static int NumberCount(int number) {
		int count = 0;
		while (number != 0) {
			count++;
			number = (number - 1) & number;
		}

		return count;
	}

	public static void main(String[] args) {
		Integer.toBinaryString(3);
		System.out.println(NumberCount(3)+"--"+Integer.toBinaryString(3));
	}

}
