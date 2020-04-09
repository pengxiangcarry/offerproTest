package pro.OfferTest.Frist;

public class PathTest {
	public static boolean Path(char a[][], String str) {
		int rows = a.length;
		int cols = a[0].length;
		int pathLength = 0;
		boolean[][] bool = new boolean[rows][cols];
		for (int row = 0; row< rows; row++) {
			for (int col = 0; col< cols; col++) {
				if (hasPath(rows, row, cols, col, str, pathLength, a, bool)) {
					return true;
				}
			}
		}

		return false;
	}

	public static boolean hasPath(int rows, int i, int cols, int j, String str, int pathLength, char a[][],
			boolean[][] bool) {
		boolean hP = false;
		if (pathLength > str.length() - 1) {
			return true;
		}
		if (i >= 0 && i < rows && j >= 0 && j < cols && a[i][j] == str.charAt(pathLength) && !bool[i][j]) {
			++pathLength;
			bool[i][j] = true;
			hP = hasPath(rows, i + 1, cols, j, str, pathLength, a, bool)
					|| hasPath(rows, i, cols, j + 1, str, pathLength, a, bool)
					|| hasPath(rows, i - 1, cols, j, str, pathLength, a, bool)
					|| hasPath(rows, i, cols, j - 1, str, pathLength, a, bool);
			if (!hP) {
				--pathLength;
				bool[i][j] = false;
			}
		}

		return hP;
	}

	public static void main(String[] args) {
		char a[][] = { { 'a', 'b', 't', 'g' }, { 'c', 'f', 'c', 's' }, { 'j', 'd', 'e', 'h' } };
		String str = "bfh";
		System.out.println(Path(a, str));
	}
}
