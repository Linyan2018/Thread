package day1_03_extends_vs_implements;

class Person extends Thread{	
	private int num = 50;
	public Person(String name){
		super(name);//���ø��๹����
	}
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			if(num > 0){
				System.out.println(super.getName() + "���˱��Ϊ" + num-- + "��ƻ��");
				//getName��Thread�еķ���
			}
		}
	}
}
//��ʽ1��ʹ�ü̳�Thread��ʵ������ͬѧ��50��ƻ���ı���
public class ExtendsDemo {
	public static void main(String[] args){
		//
		new Person("СA").start();
		new Person("СB").start();
		new Person("СC").start();
	}
}
