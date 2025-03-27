package Ch38.Domain.Dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Ch38.Domain.Dto.BookDto;

public class BookDaoImpl {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String id="root";
	private String pw="1234";
	private String url="jdbc:mysql://localhost:3306/bookDB";
	
	private static BookDaoImpl instance;
	
	private BookDaoImpl() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url,id,pw);
		
		
	};
	public static BookDaoImpl getInstance() throws ClassNotFoundException, SQLException {
		
		if(instance==null)
			instance = new BookDaoImpl();
		return instance;
	}
	
	public int insert(BookDto bookDto) throws SQLException {
		try{
			pstmt = conn.prepareStatement("insert into tbl_book values(?,?,?,?)");
			pstmt.setString(1, bookDto.getBookCode());
			pstmt.setString(2, bookDto.getBookName());
			pstmt.setString(3, bookDto.getPublisher());
			pstmt.setString(4, bookDto.getIsbn());
			return pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			throw new SQLException("BOOKDAO's INSERT SQL EXCEPTION!!");
		}finally {
			try {pstmt.close();}catch(Exception e2) {}
		}
		
	}
	
	
	
	
	
}
