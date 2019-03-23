package cn.tedu.unittest;

import java.io.FileWriter;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/* 测试驱动开发
 * 先写测试代码  再根据测试代码写功能代码
 * 
 * 单元测试
 * 单元测试的方法：“三无” 无参数 无返回值 无静态
 * 
 */

public class UnitTest {
	FileWriter fw;
	public static void main(String[] args) {
		
	}
	//如果要保证某一个方法最先被执行，那么
//	@Before
//	public void writeText() throws IOException{
//		//被Befor修饰的方法，肯定最先执行
//		FileWriter fw = new FileWriter("D:\\c.txt");
//	}
//	public void writeText2() throws IOException{
//		fw.write("abc");
//	}
//	//要保证一个方法最后被执行，使用
//	@After
//	public void close() throws IOException{
//		//被After修饰的方法，肯定最后执行
//		fw.close();
//	}
	
	@Test
	public void m2(){
		System.out.println("helloworld2");
		int sum = m5(10,20);
		System.out.println(sum);
		}
	@Test
	public void m1(){
//		System.out.println(1/0);
		System.out.println("helloworld1");
	}
	
	
	@Test
	public void m3(){
		System.out.println("helloworld3");
	}
	@Test
	public void m4(){
		System.out.println("helloworld4");
	}
	
	public int m5(int a,int b){
		return a + b;
	}
	
}
