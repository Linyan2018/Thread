package day1_02_thread;

//使用匿名内部类：
//只适用于某个类只使用一次的情况
public class AnonymousInnerClassDemo {
	public static void main(String[] args){
		//相主线程：运行游戏
		for (int i = 0; i < 50; i++) {
			System.out.println("打游戏" + i);
			if(i == 10){
				//创建线程对象，启动线程
				/*new Thread(new Runnable(){
					@Override
					public void run() {
						// TODO Auto-generated method stub
						for (int i = 0; i < 50; i++) {
							System.out.println("播放音乐" + i);
						}
					}
				}).start();*/
				new Thread(){
					public void run() {
						for (int i = 0; i < 50; i++) {
							System.out.println("播放音乐" + i);
						}
					};
				}.start();
			}
		}
	}
}	
