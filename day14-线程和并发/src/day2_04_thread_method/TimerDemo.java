package day2_04_thread_method;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

//定时器
public class TimerDemo {
	public static void main(String[] args) {
		//需求，在三秒钟后打印一句话：你好世界
		System.out.println("bebin...");
		Timer time = new Timer();
		time.schedule(new TimerTask(){
			@Override
			public void run() {
				//System.out.println("你好世界");
				System.out.println(new Date().toLocaleString());
			}
		}, 3000,1000);//两个线程，定时器也是一个线程，一般设为后台线程
		System.out.println("ending...");
	}
}
