
package cn.tedu.thread;
/*
 * �����̵߳ķ�ʽһ
 * 
 * start������run����������
 * start�����ǿ���һ���µ��߳�ȥִ��run����
 * run����������ֻ��һ���������ͨ����
 */
public class ThreadDemo01 {
	public static void main(String[] args) {
		//�����̵߳ķ�ʽһ
		//1.����һ���࣬�̳�Thread
		//2.��дThread��run����,��run����������µ��߳���Ҫִ�еĴ���
		//3.�����Զ���Ķ���
		MyThread my = new MyThread();
		//4.����start�����������߳�,����ִ��run��������
		my.start();
		
		for(int i = 0;i < 100;i++){
			System.out.println("���̴߳���i=" + i);
		}
		
	}
}
class MyThread extends Thread{
	//��дrun����,��run����������µ��߳���Ҫִ�еĴ���
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i < 100;i++){
			System.out.println("�µ��߳�i=" + i);
		}
	}
}