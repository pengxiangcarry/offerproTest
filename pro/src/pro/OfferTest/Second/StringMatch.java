package pro.OfferTest.Second;

public class StringMatch {
	public static boolean match(char[] Str, char[] ch) {
		if (Str == null || ch == null) {
			return false;
		}
		return BestMatch(Str, ch, 0, 0);

	}

	public static boolean BestMatch(char[] Str, char[] ch, int i, int j) {
		if (i == Str.length && j == ch.length) {
			return true;
		}
		if (i < Str.length && j == ch.length) {

			return false;
		}
		if (j < ch.length - 1 && ch[j + 1] == '*') {
			if ((i < Str.length && Str[i] == ch[j]) || (i < Str.length && ch[j] == '.')) {

				return BestMatch(Str, ch, i, j + 2) || BestMatch(Str, ch, i + 1, j + 2) || BestMatch(Str, ch, i + 1, j);
			} else {

				return BestMatch(Str, ch, i, j + 2);
			}

		}
		if ((i < Str.length && Str[i] == ch[j]) || (ch[j] == '.' && i < Str.length)) {

			return BestMatch(Str, ch, i + 1, j + 1);

		}
		System.out.println(i + "--" + j);
		return false;
	}

	public static void main(String[] args) {
		char[] Str = { 'a', 'a', 'a' };
		char[] ch = { 'a', 'b', '*', 'a', 'c', '*', 'a' };
		System.out.println(match(Str, ch));
	}

}
