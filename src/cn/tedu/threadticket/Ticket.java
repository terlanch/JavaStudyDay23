package cn.tedu.threadticket;

public class Ticket implements Runnable{
	int ticket = 100;
	Object obj = new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			//���߳�ÿ������һ����
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//ͬ�������
//			synchronized (obj) {
//				//�����߳�ִ�д�����еĴ���ʱ�������̲߳���ִ�д���
//				if(ticket > 0){	
//					System.out.println(Thread.currentThread().getName()+"���ڳ���"+ticket--);
//				}
//			}
			method();
		}
	}
	//ͬ������
	public synchronized void method(){
		if(ticket > 0){	
			System.out.println(Thread.currentThread().getName()+"���ڳ���"+ticket--);
		}
	}
}
