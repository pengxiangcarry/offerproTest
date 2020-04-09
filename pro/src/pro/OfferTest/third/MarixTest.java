package pro.OfferTest.third;

public class MarixTest {
	public static void PrintMarix(int[][] arr) {
		int left = 0;
		int right = arr[0].length - 1;
		int button = arr.length - 1;
		int top = 0;
		if (arr == null)
			return;
		while (left <= right && top <= button) {
			for (int col = left; col <= right; col++) {
				System.out.print(arr[top][col] + " ");
			}
			if (top < button) {
				for (int rows = top + 1; rows <= button; rows++) {
					System.out.print(arr[rows][right] + "  ");

				}
			}
			if (top < button && left < right) {
				for (int col = right - 1; col >= left; col--) {
					System.out.print(arr[button][col] + "  ");

				}
			}
			if (top < button - 1 && left < right) {
				for (int rows = button - 1; rows > top; rows--) {
					System.out.print(arr[rows][left] + "  ");

				}
			}
			left++;
			right--;
			top++;
			button--;

		}

	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		PrintMarix(arr);
	}
}
