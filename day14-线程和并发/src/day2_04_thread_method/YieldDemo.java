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

//线程的优先级
public class YieldDemo {
	public static void main(String[] args) {
		YieldThread max = new YieldThread("高优先级");
		max.setPriority(Thread.MAX_PRIORITY);
		
		YieldThread min1 = new YieldThread("低优先级1");
		min1.setPriority(Thread.MAX_PRIORITY);
		
		YieldThread min2 = new YieldThread("低优先级2");
		min2.setPriority(4);
		
		YieldThread min3 = new YieldThread("低优先级3");
		min3.setPriority(7);
		
		min1.start();
		min2.start();
		min3.start();
		max.start();
	}
}