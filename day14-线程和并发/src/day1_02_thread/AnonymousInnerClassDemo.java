package day1_02_thread;

//ʹ�������ڲ��ࣺ
//ֻ������ĳ����ֻʹ��һ�ε����
public class AnonymousInnerClassDemo {
	public static void main(String[] args){
		//�����̣߳�������Ϸ
		for (int i = 0; i < 50; i++) {
			System.out.println("����Ϸ" + i);
			if(i == 10){
				//�����̶߳��������߳�
				/*new Thread(new Runnable(){
					@Override
					public void run() {
						// TODO Auto-generated method stub
						for (int i = 0; i < 50; i++) {
							System.out.println("��������" + i);
						}
					}
				}).start();*/
				new Thread(){
					public void run() {
						for (int i = 0; i < 50; i++) {
							System.out.println("��������" + i);
						}
					};
				}.start();
			}
		}
	}
}	
