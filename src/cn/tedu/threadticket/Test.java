package cn.tedu.threadticket;

import java.util.concurrent.ConcurrentHashMap;

/*
 * 多次运行发现：
 * 可能会出现重复的票
 * 可能会出现0的票
 * 可能会出现-1的票
 * 
 * 线程安全隐患:在多线程的情况下，执行代码的结果和单线程时
 * 的结果不一定相同，我们就称之为多线程安全隐患问题。
 * 
 * 问题分析：线程执行是无序的。程序中有多条线程
 * 问题解决方案：判断代码中同时只能存在一条线程。当判断代码
 * 被线程执行时，其他线程都在外面等待。
 * 
 * 同步代码块：能够保证代码块中的代码最多只有一条线程执行。
 * synchronized(锁对象){
 * 	 可能出现安全隐患的代码
 * }
 * 
 * 锁对象可以是任意对象。但是如果有多条线程时，要保证
 * 锁对象是相同对象。
 * 只要多个线程能够共享的相同对象，都可以成为同步代码块
 * 的锁对象。
 * **方法区的内容，被线程共享。所以锁对象可以是“abc” Math.class
 * 但是new String（"abc"）不行
 * 
 * 同步代码块会让程序的效率变低，所以一般只锁可能出现安全隐患
 * 的代码
 * 
 * 
 * 同步方法：使用synchronized修饰的方法
 * 同步方法可以保证方法中至多有一条线程被执行
 * 同步方法的锁对象就是this。
 * 静态同步方法可以保证方法中至多有一条线程被执行。
 * 静态同步方法的锁对象是 类名.class
 * public synchronized static void method(){
 * 
 * 同步：只允许一条线程执行。
 * 异步：允许有多条线程同时执行。
 * 
 * 同步一定线程安全  对
 * 线程安全一定同步  错
 * 异步一定线程不安全  错
 * 线程不安全一定是异步  对
 * 
 * HashMap：异步线程不安全的
 * HashTable: 同步线程安全的
 * ConcurrentHashMap:异步线程安全的-->底层使用分桶加锁的方式
 */
public class Test {
	public static void main(String[] args) {
		//创建实现Runnable 接口的类的对象
		Ticket t = new Ticket();
		//创建Thread类的对象
		Thread thread1 = new Thread(t,"窗口1");
		Thread thread2 = new Thread(t,"窗口2");
		Thread thread3 = new Thread(t,"窗口3");
		
		//
		thread1.start();
		thread2.start();
		thread3.start();
		
		System.out.println(thread1.toString());
		System.out.println(thread2.toString());
		System.out.println(thread3.toString());
	}
	
			
			
}
