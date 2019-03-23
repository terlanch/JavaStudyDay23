
package cn.tedu.thread;
/*
 * 开辟线程的方式一
 * 
 * start方法和run方法的区别
 * start方法是开启一条新的线程去执行run方法
 * run方法，仅仅只是一个对象的普通方法
 */
public class ThreadDemo01 {
	public static void main(String[] args) {
		//开辟线程的方式一
		//1.定义一个类，继承Thread
		//2.重写Thread的run方法,在run方法中添加新的线程需要执行的代码
		//3.创建自定义的对象
		MyThread my = new MyThread();
		//4.调用start方法，开启线程,并且执行run（）方法
		my.start();
		
		for(int i = 0;i < 100;i++){
			System.out.println("主线程代码i=" + i);
		}
		
	}
}
class MyThread extends Thread{
	//重写run方法,在run方法中添加新的线程需要执行的代码
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i < 100;i++){
			System.out.println("新的线程i=" + i);
		}
	}
}