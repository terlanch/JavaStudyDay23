package cn.tedu.asserts;
/*
 * �ϵ����
 * Bug�������г����˺�Ԥ�ڲ�ͬ�Ľ����
 * Debug������bug
 * ����bug�ĳ����ֶΣ�
 * 1.����̨����
 * 2.�ϵ����
 * 
 * F5 ���������
 * F6 ִ��һ�д���
 * F8 ������һ���ϵ� ���û�жϵ�ͽ���Debug����
 */
public class DebugDemo {
	public static void main(String[] args) {
		int sum = sum(10,12,12,12);
		System.out.println();
	}
	public static int sum(int b,int... arr){
		if(b == 10){
			System.out.println("hello");
		}
		int sum = 0;
		for(int k : arr){
			sum += k;
		}
		return sum;
	}
}
