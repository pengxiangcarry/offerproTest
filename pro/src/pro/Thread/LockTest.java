package pro.Thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
	AtomicInteger race;
	
	public static void main(String[] args) {
		ReentrantLock re=new ReentrantLock();
		Thread th=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				re.lock();
				
			}
		});
		
	}

}
