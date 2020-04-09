package pro.test;

public class JavaVMStackOOM {
	private void dontStop() {
		while(true) {
			
		}
	}
	public void stackLeakByThread() {
		while(true) {
			Thread thread= new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					dontStop();
					
				}
			});
			thread.start();
			
		}
	}
	public static void main(String[] args) {
		JavaVMStackOOM oom=new JavaVMStackOOM();
		oom.stackLeakByThread();
	}

}
