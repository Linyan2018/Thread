package day1_03_synchronized;

class Apple2 implements Runnable{
	private int num = 50;
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			eat();
		}
	}
	
	private synchronized void eat(){
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

//��ʽ1��ͬ�������
public class synchronizedMethodDemo {
	public static void main(String[] args){
		Apple2 a = new Apple2();
		new Thread(a,"СA").start();
		new Thread(a,"СB").start();
		new Thread(a,"СC").start();
	}
}