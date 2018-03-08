package day2_04_thread_method;

class DaemonThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(super.getName() + "--" + super.isDaemon() + i);
		}
	}
}

//��̨�߳�
public class DaemonDemo {
	public static void main(String[] args) {
		//���̲߳��Ǻ�̨�߳�
		System.out.println(Thread.currentThread().isDaemon());
		for (int i = 0; i < 20; i++) {
			System.out.println("main:" + i);
			if(i == 10){
				DaemonThread t = new DaemonThread();
				t.setDaemon(true);//�������߳�Ϊ��̨�߳�
				t.start();
			}
		}
	}
}
