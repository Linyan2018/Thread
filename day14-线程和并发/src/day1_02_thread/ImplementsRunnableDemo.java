package day1_02_thread;

class MusicRunnable implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 50; i++) {
			System.out.println("播放音乐" + i);
		}
	}	
}

//方式2：实现Runnable接口
public class ImplementsRunnableDemo {
	public static void main(String[] args){
		//相主线程：运行游戏
		for (int i = 0; i < 50; i++) {
			System.out.println("打游戏" + i);
			if(i == 10){
				//创建线程对象，启动线程
				Thread t = new Thread(new MusicRunnable());
				t.start();
			}
		}
	}
}
