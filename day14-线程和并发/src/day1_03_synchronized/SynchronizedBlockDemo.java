package day1_03_synchronized;

class Apple1 implements Runnable{
	private int num = 50;
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			//ͬ�������:���⣬ͬ���Ĵ���̫����
			synchronized(this){	
				if(num > 0){
					System.out.println(Thread.currentThread().getName() + 
							"���˱��Ϊ" + num + "��ƻ��");
					try {  //  A,B,C
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					num--;
				}
			}
		}
	}
}

//��ʽ1��ͬ�������
public class SynchronizedBlockDemo {
	public static void main(String[] args){
		Apple1 a = new Apple1();
		new Thread(a,"СA").start();
		new Thread(a,"СB").start();
		new Thread(a,"СC").start();
	}
}
