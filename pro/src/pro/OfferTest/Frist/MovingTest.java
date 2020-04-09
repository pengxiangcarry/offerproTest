package pro.OfferTest.Frist;

public class MovingTest {
	public static int Moving(int number, int a[][]) {
		int rows = a.length;
		int cols = a[0].length;
		if (number < 0 || rows <= 0 || cols <= 0) {
			return 0;
		}
		Boolean[] visited = new Boolean[rows * cols];
		for (int i = 0; i < rows * cols; i++) {
			visited[i] = false;
		}
		int count = Moving(number, rows, cols, 0, 0, visited);
		return count;
	}

	public static int Moving(int number, int rows, int cols, int row, int col, Boolean[] visited) {
		int count = 0;
		if (check(number, rows, cols, row, col, visited)) {
			visited[rows * cols + col] = true;
			count = 1 + Moving(number, rows, cols, row - 1, col, visited)
					+ Moving(number, rows, cols, row, col - 1, visited)
					+ Moving(number, rows + 1, cols, row, col, visited)
					+ Moving(number, rows, cols + 1, row, col, visited);
		}
		return count;
	}

	public static boolean check(int number, int rows, int cols, int row, int col, Boolean[] visited) {
		if (row >= 0 && row < rows && col >= 0 && col < cols && getSum(row) + getSum(col) < number
				&& !visited[rows * cols + col]) {
			return true;
		}
		return false;
	}

	public static int getSum(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {

	}

}
