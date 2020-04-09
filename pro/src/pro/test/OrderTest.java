package pro.test;

public class OrderTest {
	static int a=0;
	static int b=0;
	static int x=0;
	static int y=0;
	private int value=0;

	private int getValue() {
		return value;
	}

	private void setValue(int value) {
		this.value = value;
	}

	public static void main(String[] args) {
		OrderTest ord=new OrderTest();
		Thread one = new Thread(new Runnable() {
			public void run() {
				ord.setValue(10);

			}
		});
		Thread other = new Thread(new Runnable() {
			public void run() {
			System.out.println(ord.getValue());

			}
		});
		one.start();
		other.start();

	}

}
