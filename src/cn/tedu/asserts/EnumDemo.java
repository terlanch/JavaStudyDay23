package cn.tedu.asserts;
/*
 * ö��
 *   �й̶�����������ʱ������ʹ��ö��
 *   ö����JDK1.5������
 *   ö����java�б�������һ����
 */
public class EnumDemo {
	public static void main(String[] args) {
//		Season s = new Season();
//		Season s = Season.Spring;
		Season spring = Season.Spring;
	}
}
//JDK 1.5֮ǰ ����ö�ٵķ�ʽ
class Season{
	private Season(){
		
	}
	//static�� ��Ϊ���췽���ⲿ�Ѿ�����ʹ�ã�����ʹ��static���ι�������
	//final: ��Ϊö�ٲ������ⲿ�޸����ݣ�����ʹ��final����
	public final static Season Spring = new Season();
	public final static Season Summer = new Season();
	public final static Season Autumn = new Season();
	public final static Season Winter = new Season();
	
//	public Season getSpring(){
//		return Spring;
//	}
}