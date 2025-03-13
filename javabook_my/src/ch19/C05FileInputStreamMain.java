package ch19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C05FileInputStreamMain {
	public static void main(String[] args) throws IOException {
	
		InputStream fin = new FileInputStream("C:\\IOTEST\\data.csv");
		StringBuffer strungBuffet = new StringBuffer();
		
		//fin.read()확인
		while(true) {
			int data= fin.read();
			if(data==-1) break;
			
			//System.out.print((char)data);
		}
		fin.close();
		
	
	}
}
