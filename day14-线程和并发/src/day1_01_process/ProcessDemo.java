package day1_01_process;

import java.io.IOException;

//��java����ο���һ�����̣����м��±�����
public class ProcessDemo {
	public static void main(String[] args) throws Exception{
		//��ʽ1��ʹ��Runtime���exec����
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("notepad");
		
		//��ʽ2��ʹ��ProcessBuilder��start����
		ProcessBuilder pd = new ProcessBuilder("notepad");
		pd.start();
	}
}
