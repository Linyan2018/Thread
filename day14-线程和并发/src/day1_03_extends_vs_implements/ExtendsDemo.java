package day1_03_extends_vs_implements;

class Person extends Thread{	
	private int num = 50;
	public Person(String name){
		super(name);//调用父类构造器
	}
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			if(num > 0){
				System.out.println(super.getName() + "吃了编号为" + num-- + "的苹果");
				//getName是Thread中的方法
			}
		}
	}
}
//方式1：使用继承Thread类实现三个同学吃50个苹果的比赛
public class ExtendsDemo {
	public static void main(String[] args){
		//
		new Person("小A").start();
		new Person("小B").start();
		new Person("小C").start();
	}
}
