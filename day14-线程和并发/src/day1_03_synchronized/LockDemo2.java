package day1_03_synchronized;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo2 {
	public static void main(String[] args) throws InterruptedException {
		final ReentrantLock lock = new ReentrantLock();
		lock.lock();
		Thread t1 = new Thread(new Runnable(){
			@Override
			public void run() {
				try {
					lock.lockInterruptibly();
					//lock.lock();
				} catch (InterruptedException e) {
					System.out.println("Interrupted");
				}
			}
		});
		t1.start();
		t1.interrupt();
		Thread.sleep(1);
	}
}
