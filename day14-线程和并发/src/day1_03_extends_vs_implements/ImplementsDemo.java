package day1_03_extends_vs_implements;

class Apple implements Runnable{
	private int num = 50;
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			if(num > 0){
				//ģ�������ӳ�
				try {  //  A,B,C
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + 
						"���˱��Ϊ" + num + "��ƻ��");
				num--;
			}
		}
	}
}
//��ʽ2��ʹ��ʵ��Runnable�ӿ�ʵ������ͬѧ��ƻ������
public class ImplementsDemo {
	public static void main(String[] args){
		//
		Apple a = new Apple();
		new Thread(a,"СA").start();
		new Thread(a,"СB").start();
		new Thread(a,"СC").start();
		//static Thread currentThread()
		//���ضԵ�ǰ����ִ�е��̶߳��������
		//String name = Thread.currentThread().getName();
	}
}
