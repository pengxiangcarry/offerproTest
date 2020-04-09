package pro.OfferTest.Frist;

public class MaxProuctSultion {
	public static int Max(int length) {
		if (length < 2)
			return 0;
		if (length == 2)
			return 1;
		if (length == 3)
			return 2;
		int arr[] = new int[length + 1];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		int max = 0;
		for (int i = 4; i <= length; i++) {
			for (int j = 1; j <= i / 2; j++) {
				int product = arr[j] * arr[i - j];
				if (max < product)
					max = product;
				arr[i] = max;
			}

		}
		max = arr[length];

		return max;
	}

	public static int Maxpolution(int length) {
		if (length < 2)
			return 0;
		if (length == 2)
			return 1;
		if (length == 3)
			return 2;
		int time3 = length / 3;
		if (length - time3 * 3 == 1) {
			time3--;
		}
		int time4 = (length - time3 * 3) / 2;

		return (int) (Math.pow(3, time3) * Math.pow(2, time4));
	}

	public static void main(String[] args) {
		System.out.println(Maxpolution(5));
	}

}
