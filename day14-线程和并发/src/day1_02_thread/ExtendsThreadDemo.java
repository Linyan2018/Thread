package day1_02_thread;

class MusicThread extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("播放音乐" + i);
		}
	}
}

//方式1：继承Thread类
public class ExtendsThreadDemo {
	public static void main(String[] args){
		//相主线程：运行游戏
		for (int i = 0; i < 50; i++) {
			System.out.println("打游戏" + i);
			if(i == 10){
				//创建线程对象，启动线程
				MusicThread t = new MusicThread();
				t.start();
			}
		}
	}
}
