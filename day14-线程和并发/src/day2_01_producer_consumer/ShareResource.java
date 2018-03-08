package day2_01_producer_consumer;

//共享资源对象（姓名  性别）
public class ShareResource {
	private String name;
	private String gender;
	private boolean isEmpty = true;//用来表示共享资源是否为空的状态
	
	//生产者向共享资源对象存储数据
	synchronized public void push(String name,String gender){
		
		try {
			while(!isEmpty){//当前isEmpty为false的时候，不空等着消费者来获取
				this.wait();//使用同步锁对象来调用，表示当前线程释放同步锁，进入等待池，只能被其他线程唤醒
			}
			//---------生产开始--------------
			this.name = name;
			Thread.sleep(10);
			this.gender = gender;
			//---------生产结束--------------
			isEmpty = false;//设置共享资源中的数据不为空
			this.notifyAll();//唤醒一个消费者
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//消费者从共享资源对象中取数据	
	synchronized public void popup(){
		try {
			while(isEmpty){//当前isEmpty为true的时候，为空等着生产者来生产
				this.wait();//使用同步锁对象来调用，表示当前线程释放同步锁，进入等待池，只能被其他线程唤醒
			}
			//---------消费开始--------------
			Thread.sleep(10);
			System.out.println(this.name + "--" + this.gender);
			//---------消费结束--------------
			isEmpty = true;
			this.notifyAll();//唤醒一个生产者
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
