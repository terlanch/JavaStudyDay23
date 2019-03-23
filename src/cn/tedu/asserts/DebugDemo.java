package cn.tedu.asserts;
/*
 * 断点调试
 * Bug：程序中出现了和预期不同的结果。
 * Debug：调试bug
 * 调试bug的常用手段：
 * 1.控制台调试
 * 2.断点调试
 * 
 * F5 钻进方法中
 * F6 执行一行代码
 * F8 跳到下一个断点 如果没有断点就结束Debug过程
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
