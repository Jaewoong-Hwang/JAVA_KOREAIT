package Domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAOImpl implements BookDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private String id = "system";
	private String pw = "1234";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";

	// 싱글톤
	private static BookDAO instance;

	private BookDAOImpl() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url,id,pw);
	}

	public static BookDAO getInstance()  throws Exception{
		if (instance == null)
			instance = new BookDAOImpl();
		return instance;
	};

	@Override
	public int insert(BookDTO bookDTO) throws Exception {
		
		try {
		pstmt=conn.prepareStatement("insert into tbl_book values(?,?,?,?)");
		pstmt.setString(1, bookDTO.getBookCode());
		pstmt.setString(2, bookDTO.getBookName());
		pstmt.setString(3, bookDTO.getPublisher());
		pstmt.setString(4, bookDTO.getIsbn());
		
		
		return pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			throw new SQLException("BOOKDAO's INSERT SQL EXCEPTION!!");
		}finally {
			try {pstmt.close();}catch(Exception e) {}
		}
	}

	@Override
	public int update(BookDTO bookDTO) throws Exception {
		
		try {
			pstmt=conn.prepareStatement("update into tbl_book values(?,?,?,?)");
			pstmt.setString(1, bookDTO.getBookCode());
			pstmt.setString(2, bookDTO.getBookName());
			pstmt.setString(3, bookDTO.getPublisher());
			pstmt.setString(4, bookDTO.getIsbn());
			
			
			return pstmt.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
				throw new SQLException("BOOKDAO's UPDATE SQL EXCEPTION!!");
			}finally {
				try {pstmt.close();}catch(Exception e) {}
			}
		
		
	}

	@Override
	public int delete(BookDTO bookDTO) throws SQLException {
		
		
		try {
			pstmt=conn.prepareStatement("delete into tbl_book values(?,?,?,?)");
			pstmt.setString(1, bookDTO.getBookCode());
			pstmt.setString(2, bookDTO.getBookName());
			pstmt.setString(3, bookDTO.getPublisher());
			pstmt.setString(4, bookDTO.getIsbn());
			
			
			return pstmt.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
				throw new SQLException("BOOKDAO's DELETE SQL EXCEPTION!!");
			}finally {
				try {pstmt.close();}catch(Exception e) {}
			}
	}

	@Override
	public BookDTO select(BookDTO bookDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookDTO> selectAll() {
	
		 List<BookDTO> list = new ArrayList<>();

		    try {
		        pstmt = conn.prepareStatement("SELECT * FROM tbl_book");
		        rs = pstmt.executeQuery();

		        while (rs.next()) {
		            BookDTO dto = new BookDTO(
		                rs.getString("bookCode"),
		                rs.getString("bookName"),
		                rs.getString("publisher"),
		                rs.getString("isbn")
		            );
		            list.add(dto);
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    } finally {
		        try { if (rs != null) rs.close(); } catch (Exception e) {}
		        try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
		    }

		    return list;
	}

}
