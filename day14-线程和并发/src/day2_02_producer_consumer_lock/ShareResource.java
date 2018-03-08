package day2_02_producer_consumer_lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//������Դ��������  �Ա�
public class ShareResource {
	private String name;
	private String gender;
	private boolean isEmpty = true;
	private final Lock lock = new ReentrantLock();
	private Condition cond = lock.newCondition();
	
	//������������Դ����洢����
	public void push(String name,String gender){
		lock.lock();//��ȡ��
		try {
			while(!isEmpty){
				cond.await();
			}
			//---------������ʼ--------------
			this.name = name;
			Thread.sleep(10);
			this.gender = gender;
			//---------��������--------------
			cond.signalAll();
			isEmpty = false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();//�ͷ���
		}
	}
	//�����ߴӹ�����Դ������ȡ����	
	public void popup(){
		lock.lock();
		try {
			while(isEmpty){
				cond.await();
			}
			//---------���ѿ�ʼ--------------
			Thread.sleep(10);
			System.out.println(this.name + "--" + this.gender);
			//---------���ѽ���--------------
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
