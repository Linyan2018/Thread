package day2_03_thread_state;

import java.io.IOException;

class Other extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Other-" + i);
		}
		
	}
}
public class RunnableDemo {
	public static void main(String[] args) throws IOException {
		Other other = new Other();//�½�״̬
		for (int i = 0; i < 50; i++) {
			System.out.println("main-" + i);
			if(i == 10){
				other.start();
			}
		}
		if(!other.isAlive()){//��other�߳��Ѿ�������ʱ��
			other.start();
		}
		
		
		
		
		
		
		//Other other = new Other();//�½�״̬
		//other.start();//������״̬
		//other.start();
/*		System.out.println("begin...");
		System.in.read();
		System.out.println("ending...");*/
	}
}
