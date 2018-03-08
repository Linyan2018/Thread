package day2_04_thread_method;

class YieldThread extends Thread{
	public YieldThread(String name){
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(super.getName() + "--" + i);
			if(i == 20){
				Thread.yield();
			}
		}
	}
}

//�̵߳����ȼ�
public class YieldDemo {
	public static void main(String[] args) {
		YieldThread max = new YieldThread("�����ȼ�");
		max.setPriority(Thread.MAX_PRIORITY);
		
		YieldThread min1 = new YieldThread("�����ȼ�1");
		min1.setPriority(Thread.MAX_PRIORITY);
		
		YieldThread min2 = new YieldThread("�����ȼ�2");
		min2.setPriority(4);
		
		YieldThread min3 = new YieldThread("�����ȼ�3");
		min3.setPriority(7);
		
		min1.start();
		min2.start();
		min3.start();
		max.start();
	}
}