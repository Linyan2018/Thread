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
		//���뷽�����̼���
		lock.lock();//��ȡ��
		if(num > 0){
			try {
				System.out.println(Thread.currentThread().getName() + 
					"���˱��Ϊ" + num + "��ƻ��");
				Thread.sleep(10);
				num--;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				lock.unlock();//�ͷ���
			}
		}
	}
}

//ͬ����Lock���ӿڣ�
public class LockDemo {
	public static void main(String[] args){
		Apple3 a = new Apple3();
		new Thread(a,"СA").start();
		new Thread(a,"СB").start();
		new Thread(a,"СC").start();
	}
}
