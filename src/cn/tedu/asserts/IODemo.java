package cn.tedu.asserts;

import java.io.FileWriter;
import java.io.IOException;

public class IODemo {
	public static void main(String[] args) {
		//JDK 1.7 try...with...source
		//���Զ�try�����еĶ�����йرղ���
		//try�����е����ݱ���Ҫ��AutoCloseable���ӽӿڵ�ʵ����
		//ʹ�÷�ʽ��������try�ģ����д�������
		//����ʹ�ô��ݹ����Ķ���
		try (FileWriter fw = new  FileWriter("D:\\a.txt")){
			fw.write("");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
