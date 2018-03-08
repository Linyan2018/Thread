package day2_04_thread_method;

class Join extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("Join:" + i);
		}
	}
}

//�����߳�
public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("begin...");
		Join joinThread = new Join();
		for (int i = 0; i < 50; i++) {
			System.out.println("main:" + i);
			if(i == 10){
				joinThread.start();
			}
			if(i == 20){
				joinThread.join();//ǿ�����и��߳�
			}
		}
		System.out.println("ending...");
	}
}
