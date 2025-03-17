package ch21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C02INSTERT {
	public static void main(String[] args) {

		//DB CONN DATA
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/testdb";
		
		//JDBC참조변수
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//
		
		try {
			
			//DREIVER 메모리 삭제
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Success...");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB CONNECTED...");
			//SQL 쿼리 준비
			pstmt = conn.prepareStatement("insert into tbl_std values('홍길동',10,'대구')");		
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {conn.close();}catch (SQLException e) {e.printStackTrace();}
		}
	}
}
