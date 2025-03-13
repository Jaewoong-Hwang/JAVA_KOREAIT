package ch19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C07FileCopyMain {
	public static void main(String[] args) throws Exception {
		
		InputStream in = new FileInputStream("C:\\IOTEST\\dog.jpg");
		OutputStream out= new FileOutputStream("C:\\IOTEST\\Copydog.jpg");
		
		
		//01 버퍼미사용
		
		while(true) {
			int data = in.read();
			if(data==-1)break;
			out.write((byte)data);
			out.flush();
			
			
		}
		in.close();
		out.close();
		// 버퍼사용
	
		
	
	}
}
