package ch22;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class C01Client {
	private void mian() throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		//Socket client = new Socket("192.168.16.203",7000);
		Socket client = new Socket("192.168.16.85",7002);

		InputStream in = client.getInputStream();		
		DataInputStream din = new DataInputStream(in);
		String recv = din.readUTF();
		System.out.println(recv);
		
		din.close();
		in.close();
		client.close();
		
		
	}
}
