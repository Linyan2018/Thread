package day2_04_thread_method;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

//��ʱ��
public class TimerDemo {
	public static void main(String[] args) {
		//�����������Ӻ��ӡһ�仰���������
		System.out.println("bebin...");
		Timer time = new Timer();
		time.schedule(new TimerTask(){
			@Override
			public void run() {
				//System.out.println("�������");
				System.out.println(new Date().toLocaleString());
			}
		}, 3000,1000);//�����̣߳���ʱ��Ҳ��һ���̣߳�һ����Ϊ��̨�߳�
		System.out.println("ending...");
	}
}
