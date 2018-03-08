package day2_01_producer_consumer;

//测试代码
public class App {
	public static void main(String[] args) {
		//创建生产者和消费者共有的资源对象
		ShareResource resouce = new ShareResource();
		//启动生产者线程
		new Thread(new Producer(resouce)).start();
		new Thread(new Producer(resouce)).start();
		//启动消费者线程
		new Thread(new Consumer(resouce)).start();
		new Thread(new Consumer(resouce)).start();
	}
}
