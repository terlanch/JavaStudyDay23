package cn.tedu.asserts;
/*
 * �ɱ����
 */
public class ArguDemo {
	public static void main(String[] args) {
		int sum = sum(10,20,1,2,23,4231,4);
		System.out.println(sum);
	}
	//�ӷ�
	//���������ͺ������...�ͱ�ʾ�ɱ����
	//�ɱ���������ϻ���һ������
	//�ɱ�������������˼�룬�����˾��ú�����
	//���Գ�֮Ϊ�﷨��
	//���ж������ʱ���ɱ����Ӧ�������һλ
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
