package day1_03_synchronized;

//单例模式----懒汉式
public class ArrayUtil2 {
	private ArrayUtil2(){}
	private volatile static ArrayUtil2 instance = null;
	//同步方法：此时同步监听对象是当前方法所在类的字节码文件
	 public static ArrayUtil2 getInstance(){
		//A  B
		if(instance == null){
			synchronized(ArrayUtil2.class){
				if(instance == null){
					instance = new ArrayUtil2();//要用的时候临时创建
				}
			}
		}
		return instance;
	}
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
	}
}
