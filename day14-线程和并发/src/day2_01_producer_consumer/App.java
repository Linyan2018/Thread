package day2_01_producer_consumer;

//���Դ���
public class App {
	public static void main(String[] args) {
		//���������ߺ������߹��е���Դ����
		ShareResource resouce = new ShareResource();
		//�����������߳�
		new Thread(new Producer(resouce)).start();
		new Thread(new Producer(resouce)).start();
		//�����������߳�
		new Thread(new Consumer(resouce)).start();
		new Thread(new Consumer(resouce)).start();
	}
}
