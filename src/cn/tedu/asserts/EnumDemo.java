package cn.tedu.asserts;
/*
 * 枚举
 *   有固定数量的内容时，可以使用枚举
 *   枚举是JDK1.5的特性
 *   枚举在java中本质上是一个类
 */
public class EnumDemo {
	public static void main(String[] args) {
//		Season s = new Season();
//		Season s = Season.Spring;
		Season spring = Season.Spring;
	}
}
//JDK 1.5之前 定义枚举的方式
class Season{
	private Season(){
		
	}
	//static： 因为构造方法外部已经不能使用，所以使用static修饰共享属性
	//final: 因为枚举不允许外部修改内容，所以使用final修饰
	public final static Season Spring = new Season();
	public final static Season Summer = new Season();
	public final static Season Autumn = new Season();
	public final static Season Winter = new Season();
	
//	public Season getSpring(){
//		return Spring;
//	}
}