package cn.tedu.unittest;

import java.io.FileWriter;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/* ������������
 * ��д���Դ���  �ٸ��ݲ��Դ���д���ܴ���
 * 
 * ��Ԫ����
 * ��Ԫ���Եķ����������ޡ� �޲��� �޷���ֵ �޾�̬
 * 
 */

public class UnitTest {
	FileWriter fw;
	public static void main(String[] args) {
		
	}
	//���Ҫ��֤ĳһ���������ȱ�ִ�У���ô
//	@Before
//	public void writeText() throws IOException{
//		//��Befor���εķ������϶�����ִ��
//		FileWriter fw = new FileWriter("D:\\c.txt");
//	}
//	public void writeText2() throws IOException{
//		fw.write("abc");
//	}
//	//Ҫ��֤һ���������ִ�У�ʹ��
//	@After
//	public void close() throws IOException{
//		//��After���εķ������϶����ִ��
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
