package cn.tedu.asserts;

import java.io.FileWriter;
import java.io.IOException;

public class IODemo {
	public static void main(String[] args) {
		//JDK 1.7 try...with...source
		//会自动try（）中的对象进行关闭操作
		//try（）中的内容必须要放AutoCloseable的子接口的实现类
		//使用方式：必须在try的（）中创建对象。
		//不能使用传递过来的对象
		try (FileWriter fw = new  FileWriter("D:\\a.txt")){
			fw.write("");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
