package pro.test;

public class CountingGC {
	public Object intence = null;
	private static final int _1MB = 1024 * 1024;
	private Byte[] bigSize = new Byte[2 * _1MB];

	public static void testgc() {
		CountingGC objA = new CountingGC();
		CountingGC objB = new CountingGC();
		objA.intence = objB;
		objB.intence = objA;
		objB = null;
		objA = null;
		System.gc();
	}

	public static void main(String[] args) {
		testgc();
	}

}
