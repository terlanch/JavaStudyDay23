package cn.tedu.asserts;
/*
 * 可变参数
 */
public class ArguDemo {
	public static void main(String[] args) {
		int sum = sum(10,20,1,2,23,4231,4);
		System.out.println(sum);
	}
	//加法
	//在数据类型后面添加...就表示可变参数
	//可变参数本质上还是一个数组
	//可变参数的这种设计思想，会让人觉得很甜蜜
	//所以称之为语法糖
	//当有多个参数时，可变参数应该在最后一位
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
