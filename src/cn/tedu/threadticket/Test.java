package cn.tedu.threadticket;

import java.util.concurrent.ConcurrentHashMap;

/*
 * ������з��֣�
 * ���ܻ�����ظ���Ʊ
 * ���ܻ����0��Ʊ
 * ���ܻ����-1��Ʊ
 * 
 * �̰߳�ȫ����:�ڶ��̵߳�����£�ִ�д���Ľ���͵��߳�ʱ
 * �Ľ����һ����ͬ�����Ǿͳ�֮Ϊ���̰߳�ȫ�������⡣
 * 
 * ����������߳�ִ��������ġ��������ж����߳�
 * �������������жϴ�����ͬʱֻ�ܴ���һ���̡߳����жϴ���
 * ���߳�ִ��ʱ�������̶߳�������ȴ���
 * 
 * ͬ������飺�ܹ���֤������еĴ������ֻ��һ���߳�ִ�С�
 * synchronized(������){
 * 	 ���ܳ��ְ�ȫ�����Ĵ���
 * }
 * 
 * �����������������󡣵�������ж����߳�ʱ��Ҫ��֤
 * ����������ͬ����
 * ֻҪ����߳��ܹ��������ͬ���󣬶����Գ�Ϊͬ�������
 * ��������
 * **�����������ݣ����̹߳�����������������ǡ�abc�� Math.class
 * ����new String��"abc"������
 * 
 * ͬ���������ó����Ч�ʱ�ͣ�����һ��ֻ�����ܳ��ְ�ȫ����
 * �Ĵ���
 * 
 * 
 * ͬ��������ʹ��synchronized���εķ���
 * ͬ���������Ա�֤������������һ���̱߳�ִ��
 * ͬ�����������������this��
 * ��̬ͬ���������Ա�֤������������һ���̱߳�ִ�С�
 * ��̬ͬ���������������� ����.class
 * public synchronized static void method(){
 * 
 * ͬ����ֻ����һ���߳�ִ�С�
 * �첽�������ж����߳�ͬʱִ�С�
 * 
 * ͬ��һ���̰߳�ȫ  ��
 * �̰߳�ȫһ��ͬ��  ��
 * �첽һ���̲߳���ȫ  ��
 * �̲߳���ȫһ�����첽  ��
 * 
 * HashMap���첽�̲߳���ȫ��
 * HashTable: ͬ���̰߳�ȫ��
 * ConcurrentHashMap:�첽�̰߳�ȫ��-->�ײ�ʹ�÷�Ͱ�����ķ�ʽ
 */
public class Test {
	public static void main(String[] args) {
		//����ʵ��Runnable �ӿڵ���Ķ���
		Ticket t = new Ticket();
		//����Thread��Ķ���
		Thread thread1 = new Thread(t,"����1");
		Thread thread2 = new Thread(t,"����2");
		Thread thread3 = new Thread(t,"����3");
		
		//
		thread1.start();
		thread2.start();
		thread3.start();
		
		System.out.println(thread1.toString());
		System.out.println(thread2.toString());
		System.out.println(thread3.toString());
	}
	
			
			
}
