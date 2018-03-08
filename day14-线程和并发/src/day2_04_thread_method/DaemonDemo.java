package day2_04_thread_method;

class DaemonThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(super.getName() + "--" + super.isDaemon() + i);
		}
	}
}

//后台线程
public class DaemonDemo {
	public static void main(String[] args) {
		//主线程不是后台线程
		System.out.println(Thread.currentThread().isDaemon());
		for (int i = 0; i < 20; i++) {
			System.out.println("main:" + i);
			if(i == 10){
				DaemonThread t = new DaemonThread();
				t.setDaemon(true);//设置子线程为后台线程
				t.start();
			}
		}
	}
}
