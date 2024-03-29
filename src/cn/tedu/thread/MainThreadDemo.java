package cn.tedu.thread;
/*
 * 线程
 * 
 * 进程：当一个程序需要被运行时，需要进入到内存中。
 * 在内存中运行的程序，就是进程。进程都有自己特点
 * 的功能。Windows操作系统支持运行多个进程。
 * 
 * **线程：是进程中的一个执行单元。负责进程中程序的执行。
 * 一个进程至少有一条线程。一个进程如果有多条线程，我们称之为
 * 多线程程序。如果只有一条线程，称之为单线程程序。
 * 
 * *多线程的优点：
 * 1.提高用户的用户体验。
 * 2.多线程可以提高CPU的利用率。
 * 
 * **Java里面的线程使用的是抢占式调度
 * 优先执行优先级高的线程。当线程的优先级相同时，
 * 会随机执行一条线程（线程的随机性）
 * 
 * *多线程并没有真正提高代码的运行速度，但是提高了CPU的利用率。
 * 因为线程是在CPU中进行快速的切换，由于切换的速度太快，
 * 会让人误以为多个线程在同时执行。但其实同一时刻，一个
 * CPU上面只执行了一条线程。
 * 
 * 线程和硬件进行交互时，会暂时空置CPU，造成CPU的资源浪费。
 * 
 */
public class MainThreadDemo {
	//默认程序中有一条线程在执行，这个就是主线程
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println("main方法" + i);
		}
		demo();
	}
	public static void demo(){
		for (int i = 0; i < 100; i++) {
			System.out.println("demo方法" + i);
		}
		
	}
}
