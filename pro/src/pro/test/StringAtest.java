package pro.test;

public class StringAtest {
	public static String StringTest(String str) {
		
		
		return str.replace(" ", "%20");
	}
	public static void main(String[] args) {
		String str="We are happy";
		System.out.println(StringTest(str));
		

	}

}
