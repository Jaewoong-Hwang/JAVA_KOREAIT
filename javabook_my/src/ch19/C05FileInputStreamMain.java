package ch19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C05FileInputStreamMain {
	public static void main(String[] args) throws IOException {
	
		InputStream fin = new FileInputStream("C:\\IOTEST\\data.xlsx");
		StringBuffer strungBuffet = new StringBuffer();
		
		//fin.read()확인
//		long sTime = System.currentTimeMillis();
//		while(true) {
//			int data= fin.read();
//			if(data==-1) break;
//			
//			//System.out.print((char)data);
//		}
//		long eTime = System.currentTimeMillis();
//		System.out.println("소요시간 : " + (eTime-sTime)+"ms");
//		fin.close();
	
		
		//read([])
		byte [] buf = new byte[1024];					//buf 를 넣으니 상대적으로 시간이 줄어든 것을 볼 수 있다.
		long sTime = System.currentTimeMillis();
		while(true) {
			int data= fin.read(buf);
			if(data==-1) break;
			
			//System.out.print((char)data);
		}
		long eTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (eTime-sTime)+"ms");
		fin.close();
	
	
	
	}
}
