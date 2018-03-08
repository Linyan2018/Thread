package day1_03_synchronized;

//单例模式---饿汉式
public class ArrayUtil1 {
	
	private ArrayUtil1(){
		
	}
	private static ArrayUtil1 instance = new ArrayUtil1();
	public static ArrayUtil1 getInstance(){
		return instance;
	}
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
	}
}
