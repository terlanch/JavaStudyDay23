package cn.tedu.practice;

public class Practice01 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "�߳����п�ʼ��");
		new MitiSay("A").start();
		new MitiSay("B").start();
		System.out.println(Thread.currentThread().getName() + "�߳����н�����");
	}
}
class MitiSay extends Thread{
	public MitiSay(String threadName) {
		super(threadName);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "�߳����п�ʼ");
		for(int i = 0;i < 10;i++){
			System.out.println(i + " "+ getName());
			try {
				sleep((int)Math.random()*10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(getName() + "�߳����н���");
	}
}
