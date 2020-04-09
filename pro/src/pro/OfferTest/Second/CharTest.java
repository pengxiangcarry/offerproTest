package pro.OfferTest.Second;

public class CharTest {
	public boolean CharT(char[] Str) {
		if (Str == null) {
			return false;
		}
		return new String(Str).matches("[+-]?[0-9]*(\\.[0-9]*)?([eE]?[+-]?[0-9]+)?)");
	}

}
