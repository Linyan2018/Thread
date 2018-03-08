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

//�̵߳����ȼ�
public class PriorityDemo {
	public static void main(String[] args) {
		PriorityThread max = new PriorityThread("�����ȼ�");
		max.setPriority(Thread.MAX_PRIORITY);
		
		PriorityThread min1 = new PriorityThread("�����ȼ�1");
		min1.setPriority(Thread.MAX_PRIORITY);
		
		PriorityThread min2 = new PriorityThread("�����ȼ�2");
		min2.setPriority(4);
		
		PriorityThread min3 = new PriorityThread("�����ȼ�3");
		min3.setPriority(7);
		
		min1.start();
		min2.start();
		min3.start();
		max.start();
		
		//�������̵߳����ȼ�
		//Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		//��ȡ���̵߳����ȼ�
		//System.out.println(Thread.currentThread().getPriority());	
	}
}
