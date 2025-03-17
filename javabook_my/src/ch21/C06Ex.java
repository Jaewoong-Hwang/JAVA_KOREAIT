package ch21;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class ChargeStation{
	private int no;
	private String section;
	private String station;
	private String name;
	private int zipcode;
	private String address;
	//Getter and Setter
	//toString
	//모든 인자 생성자 	
}
public class C06Ex {
	//DB CONN DATA
	static String id = "root";
	static String pw = "1234";
	static String url = "jdbc:mysql://localhost:3306/testdb";
	
	//JDBC참조변수
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	public static void connect() throws Exception {
			//DB 연결코드
	}
	public static void Select() throws Exception {
			//전체 조회
	}
	public static void Insert(ChargeStation obj) throws Exception {
			//ChargeStation 객체를 받아 내용 insert

	}
	public static void Update() throws Exception {
		//수정
	}
	public static void Delete() throws Exception {
		//삭제
	}
	
	//자원제거용 함수 오버로딩
	public static void freeConnection(Connection conn) throws Exception  {}
	public static void freeConnection(PreparedStatement pstmt) throws Exception{
		pstmt.close();
	}
	public static void freeConnection(PreparedStatement pstmt,ResultSet rs)throws Exception {
		pstmt.close();
		rs.close();
	}
	
	
	public static void main(String[] args) {
		try {
			connect();
			Insert(new ChargeStation(201,"대구광역시","대구지사","대구가스",10101,"대구"));
			Select();

		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
