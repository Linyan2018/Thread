package day2_01_producer_consumer;

//������Դ��������  �Ա�
public class ShareResource {
	private String name;
	private String gender;
	private boolean isEmpty = true;//������ʾ������Դ�Ƿ�Ϊ�յ�״̬
	
	//������������Դ����洢����
	synchronized public void push(String name,String gender){
		
		try {
			while(!isEmpty){//��ǰisEmptyΪfalse��ʱ�򣬲��յ�������������ȡ
				this.wait();//ʹ��ͬ�������������ã���ʾ��ǰ�߳��ͷ�ͬ����������ȴ��أ�ֻ�ܱ������̻߳���
			}
			//---------������ʼ--------------
			this.name = name;
			Thread.sleep(10);
			this.gender = gender;
			//---------��������--------------
			isEmpty = false;//���ù�����Դ�е����ݲ�Ϊ��
			this.notifyAll();//����һ��������
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//�����ߴӹ�����Դ������ȡ����	
	synchronized public void popup(){
		try {
			while(isEmpty){//��ǰisEmptyΪtrue��ʱ��Ϊ�յ���������������
				this.wait();//ʹ��ͬ�������������ã���ʾ��ǰ�߳��ͷ�ͬ����������ȴ��أ�ֻ�ܱ������̻߳���
			}
			//---------���ѿ�ʼ--------------
			Thread.sleep(10);
			System.out.println(this.name + "--" + this.gender);
			//---------���ѽ���--------------
			isEmpty = true;
			this.notifyAll();//����һ��������
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
