package day1_03_extends_vs_implements;

class Apple implements Runnable{
	private int num = 50;
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			if(num > 0){
				//模拟网络延迟
				try {  //  A,B,C
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + 
						"吃了编号为" + num + "的苹果");
				num--;
			}
		}
	}
}
//方式2：使用实现Runnable接口实现三个同学吃苹果比赛
public class ImplementsDemo {
	public static void main(String[] args){
		//
		Apple a = new Apple();
		new Thread(a,"小A").start();
		new Thread(a,"小B").start();
		new Thread(a,"小C").start();
		//static Thread currentThread()
		//返回对当前正在执行的线程对象的引用
		//String name = Thread.currentThread().getName();
	}
}
