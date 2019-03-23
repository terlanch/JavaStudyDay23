package cn.tedu.thread;
/*
 * 创建线程的方式二
 * 1.自定义类实现Runnable接口
 * 2.实现Runnable接口的Run方法，在run方法中写新的
 * 线程要执行的代码
 * 3.创建自定义对象
 * 4.创建Thread对象，并将自定义对象通过构造方法的参数传到
 * Thread对象中
 * 5.调用start方法，开启新的线程
 * 可以使用匿名内部类
 * 
 * 
 * 创建线程的方式三
 * 实现Callable接口的call方法，大数据阶段会讲。 
 */
public class TreadDemo02 {
	public static void main(String[] args) {
//		//创建已定义对象
//		MyRunnable my = new MyRunnable();
//		//在创建Thread对象
//		Thread t = new Thread(my);
//		//调用start方法
//		t.start();
		
		new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 100; i++) {
					System.out.println("新的线程i=" + i);
				}
			}
			
		}).start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("main方法i=" + i);
		}
	}
	
	
	
}

//class MyRunnable implements Runnable{
//
//	//实现Runnable接口的run方法
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		for (int i = 0; i < 100; i++) {
//			System.out.println("新的线程i=" + i);
//		}
//	}
//	
//}