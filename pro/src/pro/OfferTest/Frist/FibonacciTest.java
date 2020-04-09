package pro.OfferTest.Frist;

public class FibonacciTest {

	public static int Fib( int n) {
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}
		return Fib(n-1)+Fib(n-2);
	}
	public static long FibT(int n) {
		long result=0;
		int fib[]= {0,1};
		if(n<2) {
			return fib[n];
		}
		long fibminOne=0;
		long fibminTwo=1;
		
		for(int i=2;i<=n;i++) {
			result=fibminOne+fibminTwo;
			fibminOne=fibminTwo;
			fibminTwo=result;
		}
		return result;
		
	}
public static void main(String[] args) {
	System.out.println(Fib(10));
	System.out.println(FibT(100));
}
}
