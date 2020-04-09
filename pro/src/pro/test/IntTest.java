package pro.test;

public class IntTest {
	volatile int a;
	public static void foo(Object obj) {
		if(obj!=null) {
			System.out.println("do sanmething");
		}
		
	}
	public static void testfoo() {
		Object obj=null;
		foo(obj);
	}
	public static void main(String[] args) {
		Object obj=null;
		foo(obj);
		
		
	}
}

