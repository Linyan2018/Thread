package day2_04_thread_method;

public class SleepDemo {
	public static void main(String[] args) {
		for (int i = 10; i > 0; i--) {
			System.out.println("ªπ £" + i + "√Î");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("±¨’®");
	}
}
