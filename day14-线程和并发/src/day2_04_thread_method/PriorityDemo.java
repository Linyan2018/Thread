package day2_04_thread_method;

class PriorityThread extends Thread{
	public PriorityThread(String name){
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(super.getName() + "--" + i);
		}
	}
}

//线程的优先级
public class PriorityDemo {
	public static void main(String[] args) {
		PriorityThread max = new PriorityThread("高优先级");
		max.setPriority(Thread.MAX_PRIORITY);
		
		PriorityThread min1 = new PriorityThread("低优先级1");
		min1.setPriority(Thread.MAX_PRIORITY);
		
		PriorityThread min2 = new PriorityThread("低优先级2");
		min2.setPriority(4);
		
		PriorityThread min3 = new PriorityThread("低优先级3");
		min3.setPriority(7);
		
		min1.start();
		min2.start();
		min3.start();
		max.start();
		
		//设置主线程的优先级
		//Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		//获取主线程的优先级
		//System.out.println(Thread.currentThread().getPriority());	
	}
}
