package pro.test;

public class StackTest {
	private int stack = 1;

	public void stackleak() {
		stack++;
		stackleak();
	}
	public static void main(String[] args) throws Throwable {
		StackTest sta=new StackTest();
		try {
			sta.stackleak();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("stack:"+sta.stack);
			throw e;
		}
	}

}
