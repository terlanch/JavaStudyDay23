package cn.tedu.thread;
/*
 * 三个窗口同时卖100张票
 */
public class practicedemo1 {
	//代表三个窗口同时出售的票
	static int i = 100;
	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				int j1 = 0;
				while(i != 0){
					
					j1++;
					i--;
					System.out.println("窗口1卖了" + j1);
				}
				System.out.println("最终窗口1卖了" + j1);
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				int j2 = 0;
				while(i != 0){	
					j2++;
					i--;
					System.out.println("窗口2卖了" + j2);
				}
				System.out.println("最终窗口2卖了" + j2);
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				int j3 = 0;
				while(i != 0){
					j3++;
					i--;
					System.out.println("窗口3卖了" + j3);
				}
				System.out.println("最终窗口3卖了" + j3);
			}
		}).start();
		
		}
	}
