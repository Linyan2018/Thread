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
					"吃了编号为" + num + "的苹果");
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

//方式1：同步代码块
public class synchronizedMethodDemo {
	public static void main(String[] args){
		Apple2 a = new Apple2();
		new Thread(a,"小A").start();
		new Thread(a,"小B").start();
		new Thread(a,"小C").start();
	}
}