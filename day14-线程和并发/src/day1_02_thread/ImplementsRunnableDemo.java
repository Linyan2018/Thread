package day1_02_thread;

class MusicRunnable implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 50; i++) {
			System.out.println("��������" + i);
		}
	}	
}

//��ʽ2��ʵ��Runnable�ӿ�
public class ImplementsRunnableDemo {
	public static void main(String[] args){
		//�����̣߳�������Ϸ
		for (int i = 0; i < 50; i++) {
			System.out.println("����Ϸ" + i);
			if(i == 10){
				//�����̶߳��������߳�
				Thread t = new Thread(new MusicRunnable());
				t.start();
			}
		}
	}
}
