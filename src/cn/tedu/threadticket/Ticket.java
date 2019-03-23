package cn.tedu.threadticket;

public class Ticket implements Runnable{
	int ticket = 100;
	Object obj = new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			//让线程每次休眠一毫秒
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//同步代码块
//			synchronized (obj) {
//				//当有线程执行代码块中的代码时，其他线程不会执行代码
//				if(ticket > 0){	
//					System.out.println(Thread.currentThread().getName()+"正在出售"+ticket--);
//				}
//			}
			method();
		}
	}
	//同步方法
	public synchronized void method(){
		if(ticket > 0){	
			System.out.println(Thread.currentThread().getName()+"正在出售"+ticket--);
		}
	}
}
