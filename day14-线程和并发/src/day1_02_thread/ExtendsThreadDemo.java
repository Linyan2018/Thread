package day1_02_thread;

class MusicThread extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("��������" + i);
		}
	}
}

//��ʽ1���̳�Thread��
public class ExtendsThreadDemo {
	public static void main(String[] args){
		//�����̣߳�������Ϸ
		for (int i = 0; i < 50; i++) {
			System.out.println("����Ϸ" + i);
			if(i == 10){
				//�����̶߳��������߳�
				MusicThread t = new MusicThread();
				t.start();
			}
		}
	}
}
