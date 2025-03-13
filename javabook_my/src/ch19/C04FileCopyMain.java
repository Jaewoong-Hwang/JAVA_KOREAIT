package ch19;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class C04FileCopyMain {

	private static String FileDir = "C:\\IOTEST\\";
	public static void main(String[] args) throws IOException 
	{
		Reader fin = new FileReader("C:\\IOTEST\\test3.txt");
		int data = 0;
		String str="";
		StringBuffer buffer = new StringBuffer();
		
		//buf를 사용하는 read 와 아닌 read의 차이는?
		char[]buf=new char[1024]; //1024byte
		fin.read(buf);
		
		long startTime = System.currentTimeMillis();
		while ((data = fin.read(buf)) != -1)  
		{   
			
//			buffer.append((char)data);//read 라는 함수를 쓰면 시간이 오래걸린다.
			buffer.append(buf);  // 시간이 줄어드는 걸 확인할 수 있다.
		}
		long endTime = System.currentTimeMillis();
		System.out.println();
		System.out.println("소요시간:" + (endTime-startTime)+"ms");
//		System.out.println(buffer);
		
		fin.close();
	}
}
