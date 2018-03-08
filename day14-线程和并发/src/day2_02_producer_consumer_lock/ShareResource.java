package day2_02_producer_consumer_lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//共享资源对象（姓名  性别）
public class ShareResource {
	private String name;
	private String gender;
	private boolean isEmpty = true;
	private final Lock lock = new ReentrantLock();
	private Condition cond = lock.newCondition();
	
	//生产者向共享资源对象存储数据
	public void push(String name,String gender){
		lock.lock();//获取锁
		try {
			while(!isEmpty){
				cond.await();
			}
			//---------生产开始--------------
			this.name = name;
			Thread.sleep(10);
			this.gender = gender;
			//---------生产结束--------------
			cond.signalAll();
			isEmpty = false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();//释放锁
		}
	}
	//消费者从共享资源对象中取数据	
	public void popup(){
		lock.lock();
		try {
			while(isEmpty){
				cond.await();
			}
			//---------消费开始--------------
			Thread.sleep(10);
			System.out.println(this.name + "--" + this.gender);
			//---------消费结束--------------
			isEmpty = true;
			cond.signalAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
}
