package ch19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C07FileCopyMain {
	public static void main(String[] args) throws Exception {
		
		InputStream in = new FileInputStream("C:\\IOTEST\\FigmaSetup.exe");
		OutputStream out= new FileOutputStream("C:\\IOTEST\\CopyFigmaSetup.exe");
		
		
		//01 버퍼미사용
		
//		while(true) {
//			int data = in.read();
//			if(data==-1)break;
//			out.write((byte)data);
//			out.flush();
//			
//			
//		}
//		in.close();
//		out.close();
		
		//02 버퍼사용
		byte [] buff = new byte[4096];					
		long sTime = System.currentTimeMillis();
		while(true) {
			int data= in.read(buff);
			if(data==-1) break;
//			out.write((byte)data);
			out.write(buff, 0, data); //쓸때없는 데이터가 들어오는 것을 막음으로서 카피가 빨라짐.
			out.flush();
			
			//System.out.print((char)data);
		}
		long eTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (eTime-sTime)+"ms");
		in.close();
		out.close();
		
	
	}
}
