package day1_03_synchronized;

//����ģʽ----����ʽ
public class ArrayUtil2 {
	private ArrayUtil2(){}
	private volatile static ArrayUtil2 instance = null;
	//ͬ����������ʱͬ�����������ǵ�ǰ������������ֽ����ļ�
	 public static ArrayUtil2 getInstance(){
		//A  B
		if(instance == null){
			synchronized(ArrayUtil2.class){
				if(instance == null){
					instance = new ArrayUtil2();//Ҫ�õ�ʱ����ʱ����
				}
			}
		}
		return instance;
	}
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
	}
}
