package cn.tedu.thread;
/*
 * �����̵߳ķ�ʽ��
 * 1.�Զ�����ʵ��Runnable�ӿ�
 * 2.ʵ��Runnable�ӿڵ�Run��������run������д�µ�
 * �߳�Ҫִ�еĴ���
 * 3.�����Զ������
 * 4.����Thread���󣬲����Զ������ͨ�����췽���Ĳ�������
 * Thread������
 * 5.����start�����������µ��߳�
 * ����ʹ�������ڲ���
 * 
 * 
 * �����̵߳ķ�ʽ��
 * ʵ��Callable�ӿڵ�call�����������ݽ׶λὲ�� 
 */
public class TreadDemo02 {
	public static void main(String[] args) {
//		//�����Ѷ������
//		MyRunnable my = new MyRunnable();
//		//�ڴ���Thread����
//		Thread t = new Thread(my);
//		//����start����
//		t.start();
		
		new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 100; i++) {
					System.out.println("�µ��߳�i=" + i);
				}
			}
			
		}).start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("main����i=" + i);
		}
	}
	
	
	
}

//class MyRunnable implements Runnable{
//
//	//ʵ��Runnable�ӿڵ�run����
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		for (int i = 0; i < 100; i++) {
//			System.out.println("�µ��߳�i=" + i);
//		}
//	}
//	
//}