package cn.tedu.practice;

public class Practice02 implements Runnable{
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "线程运行开始！");
		Practice02 p2 = new Practice02();
		Thread t1 = new Thread(p2);
		Thread t2 = new Thread(p2);
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName() + "线程运行结束!");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + "线程运行开始");
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " "+ Thread.currentThread().getName());
			try {
				Thread.sleep((int)Math.random()*10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + "线程运行结束");
	}
	
}