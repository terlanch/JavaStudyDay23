package cn.tedu.asserts;

import java.util.Scanner;

/*
 * ����
 * java��Ĭ��û�п�������
 * 
 */
public class AssertDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������10������");
		int i = sc.nextInt();
		
		i = i / 2;
		//����i��ֵ�϶���>=5��������ǣ���ô˵���û�ʹ�ô���
		//���д������������������ִ���
		assert i >= 5;
		
	}
}
