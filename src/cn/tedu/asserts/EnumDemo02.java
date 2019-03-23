package cn.tedu.asserts;
/*
 * JDK1.5后用enum关键字修饰枚举
 * 
 * 枚举本质上是一个类，里面可以提供有参构造
 * 如果要提供有参构造，那么必须提供对应的无参构造
 * 。而且构造方法必须使用private修饰。
 * 
 * switch()可以使用枚举
 */
public class EnumDemo02 {
	public static void main(String[] args) {
		Season1 s = Season1.Spring;
		switch(s){
		case Spring:
			System.out.println("春天");
			break;
		case Summer:
			System.out.println("夏天");
			break;
		case Autumn:
			System.out.println("秋天");
			break;
		case Winter:
			System.out.println("冬天");
			break;
		}
	}
}

enum Season1{
	//定义枚举的内容必须在类的有效代码的首行
//	A,B;
	//public final static Season Spring = new Season(3);
	Spring(3) {
		@Override
		public void play() {
			// TODO Auto-generated method stub
			System.out.println("浅草才能没马蹄");
		}
	},Summer {
		@Override
		public void play() {
			// TODO Auto-generated method stub
			System.out.println("游泳");
		}
	},Autumn {
		@Override
		public void play() {
			// TODO Auto-generated method stub
			System.out.println("停车坐爱枫林晚");
		}
	},Winter {
		@Override
		public void play() {
			// TODO Auto-generated method stub
			System.out.println("打雪仗");
		}
	};
	private int month;
	
	private Season1(){
		
	}
	private Season1(int month){
		this.month = month;
	}
	//抽象方法
	
	public abstract void play();
}