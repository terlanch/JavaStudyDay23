package cn.tedu.asserts;
/*
 * JDK1.5����enum�ؼ�������ö��
 * 
 * ö�ٱ�������һ���࣬��������ṩ�вι���
 * ���Ҫ�ṩ�вι��죬��ô�����ṩ��Ӧ���޲ι���
 * �����ҹ��췽������ʹ��private���Ρ�
 * 
 * switch()����ʹ��ö��
 */
public class EnumDemo02 {
	public static void main(String[] args) {
		Season1 s = Season1.Spring;
		switch(s){
		case Spring:
			System.out.println("����");
			break;
		case Summer:
			System.out.println("����");
			break;
		case Autumn:
			System.out.println("����");
			break;
		case Winter:
			System.out.println("����");
			break;
		}
	}
}

enum Season1{
	//����ö�ٵ����ݱ����������Ч���������
//	A,B;
	//public final static Season Spring = new Season(3);
	Spring(3) {
		@Override
		public void play() {
			// TODO Auto-generated method stub
			System.out.println("ǳ�ݲ���û����");
		}
	},Summer {
		@Override
		public void play() {
			// TODO Auto-generated method stub
			System.out.println("��Ӿ");
		}
	},Autumn {
		@Override
		public void play() {
			// TODO Auto-generated method stub
			System.out.println("ͣ������������");
		}
	},Winter {
		@Override
		public void play() {
			// TODO Auto-generated method stub
			System.out.println("��ѩ��");
		}
	};
	private int month;
	
	private Season1(){
		
	}
	private Season1(int month){
		this.month = month;
	}
	//���󷽷�
	
	public abstract void play();
}