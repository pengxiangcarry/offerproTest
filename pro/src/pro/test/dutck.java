package pro.test;

public class dutck {

	static int i = 0;
	public static void duack() {
		try {
			i++;
			duack();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		
		duack();
	}

}
