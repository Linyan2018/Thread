package day2_02_producer_consumer_lock;

//������
public class Producer implements Runnable{
	private ShareResource resouce = null;
	public Producer(ShareResource resouce) {
		super();
		this.resouce = resouce;
	}

	public void run(){
		for (int i = 0; i < 50; i++) {
			if(i % 2 == 0){
				resouce.push("����", "��");
			}else{
				resouce.push("���", "Ů");
			}
		}
	}
}
