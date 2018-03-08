package day1_01_process;

import java.io.IOException;

//在java中如何开启一个进程，运行记事本程序
public class ProcessDemo {
	public static void main(String[] args) throws Exception{
		//方式1：使用Runtime类的exec方法
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("notepad");
		
		//方式2：使用ProcessBuilder的start方法
		ProcessBuilder pd = new ProcessBuilder("notepad");
		pd.start();
	}
}
