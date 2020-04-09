package pro.Thread;

public class thread extends Thread {
	int i;
	@Override
	public void run() {
		synchronized (Object.class) {
			// TODO Auto-generated method stub
			for (i = 0; i < 100; i++) {
				System.out.println(i);
//				try {
//					sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}

			}
		}
	}
	public static void main(String[] args) {
		thread t1=new thread();
		thread t2=new thread();
		t1.start();
		t2.start();
	}

}
