package cn.tedu.thread;
/*
 * ��������ͬʱ��100��Ʊ
 */
public class practicedemo1 {
	//������������ͬʱ���۵�Ʊ
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
					System.out.println("����1����" + j1);
				}
				System.out.println("���մ���1����" + j1);
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
					System.out.println("����2����" + j2);
				}
				System.out.println("���մ���2����" + j2);
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
					System.out.println("����3����" + j3);
				}
				System.out.println("���մ���3����" + j3);
			}
		}).start();
		
		}
	}
