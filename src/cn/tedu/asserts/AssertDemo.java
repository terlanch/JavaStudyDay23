package cn.tedu.asserts;

import java.util.Scanner;

/*
 * 断言
 * java中默认没有开启断言
 * 
 */
public class AssertDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个大于10的整数");
		int i = sc.nextInt();
		
		i = i / 2;
		//断言i的值肯定是>=5，如果不是，那么说明用户使用错误
		//这行代码如果不成立，会出现错误
		assert i >= 5;
		
	}
}
