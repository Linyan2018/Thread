package day2_02_producer_consumer_lock;

//Ïû·ÑÕß
public class Consumer implements Runnable {
	private ShareResource resouce = null;
	
	public Consumer(ShareResource resouce) {
		super();
		this.resouce = resouce;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 50; i++) {
			resouce.popup();
		}
	}
}
