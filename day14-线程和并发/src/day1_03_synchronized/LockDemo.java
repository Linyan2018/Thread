package day1_03_synchronized;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Apple3 implements Runnable{
	private int num = 50;
	
	private final Lock lock = new ReentrantLock();
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			eat();
		}
	}
	private void eat(){
		//进入方法立刻加锁
		lock.lock();//获取锁
		if(num > 0){
			try {
				System.out.println(Thread.currentThread().getName() + 
					"吃了编号为" + num + "的苹果");
				Thread.sleep(10);
				num--;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				lock.unlock();//释放锁
			}
		}
	}
}

//同步锁Lock（接口）
public class LockDemo {
	public static void main(String[] args){
		Apple3 a = new Apple3();
		new Thread(a,"小A").start();
		new Thread(a,"小B").start();
		new Thread(a,"小C").start();
	}
}
