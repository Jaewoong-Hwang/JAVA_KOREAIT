package Ch29_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class BookDto {
	private Long bookCode;
	private String bookName;
	private String publisher;
	private String isbn;

	public BookDto(Long bookCode, String bookName, String publisher, String isbn) {
		super();
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.publisher = publisher;
		this.isbn = isbn;
	}

	public Long getBookCode() {
		return bookCode;
	}

	public void setBookCode(Long bookCode) {
		this.bookCode = bookCode;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "BookDto [bookCode=" + bookCode + ", bookName=" + bookName + ", publisher=" + publisher + ", isbn="
				+ isbn + "]";
	}

}

public class 문제2 {

	// DB CONN DATA
	private static String id = "root";
	private static String pw = "1234";
	private static String url = "jdbc:mysql://localhost:3306/tmpdb";

	// JDBC참조변수
	private static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rs;

	public static void conn() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loading Success...");
		conn = DriverManager.getConnection(url, id, pw);
		System.out.println("DB CONNECTED...");
	}

	public static List<BookDto> selectAll() throws SQLException {
		
		pstmt = conn.prepareStatement("select * from tbl_book");

		rs = pstmt.executeQuery();
		if (rs != null) {
			while (rs.next()) {
				System.out.print(rs.getInt("bookCode") + " ");
				System.out.print(rs.getString("bookName") + "\t");
				System.out.print(rs.getString("publisher") + "\t");
				System.out.print(rs.getString("isbn") + "\n");
			}
		}
		freeConnection(pstmt, rs);
		return null;
			

	}

	
	public static BookDto select(Long bookCode) throws SQLException {
		return null;

	}

	public static int insertBook(BookDto bookDto) throws Exception {
	
		pstmt = conn.prepareStatement("insert into tbl_book values(?,?,?,?)");
		pstmt.setLong(1, bookDto.getBookCode());
		pstmt.setString(2, bookDto.getBookName());
		pstmt.setString(3, bookDto.getPublisher());
		pstmt.setString(4, bookDto.getIsbn());

		int result = pstmt.executeUpdate();
		if (result > 0)
			System.out.println("[INFO] INSERT 성공");
		else
			System.out.println("[ERRPR] INSERT 실패");
		freeConnection(pstmt);
		

		return result;
	}
	
	

	public static int updateBook(BookDto bookDto) throws SQLException {
		pstmt = conn.prepareStatement("update tbl_book values(?,?,?,?)");
		pstmt.setLong(1, bookDto.getBookCode());
		pstmt.setString(2, bookDto.getBookName());
		pstmt.setString(3, bookDto.getPublisher());
		pstmt.setString(4, bookDto.getIsbn());
		
		
		// SQL 실행
		int result =  pstmt.executeUpdate();
		
		if(result>0)
			System.out.println("UPDATE 성공");
		else
			System.out.println("UPDATE 실패");
		return result;
	}

	public static int deleteBook(Long bookCode) throws SQLException {
		return -1;
	}
	
	public static void freeConnection(PreparedStatement pstmt) throws Exception {
		pstmt.close();
	}
	private static void freeConnection(PreparedStatement pstmt, ResultSet rs) throws SQLException {
		pstmt.close();
		rs.close();
	}

	public static void main(String[] args) {
		try {
			// DBConn
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Success...");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB CONNECTED...");
			conn();
			// Tx start
			System.out.println("INSERT 시작....");
			conn.setAutoCommit(false);
			// Insert
			insertBook(new BookDto(1L, "도서명1", "출판사명1", "isbn-1"));
			insertBook(new BookDto(2L, "도서명2", "출판사명2", "isbn-2"));
			insertBook(new BookDto(3L, "도서명3", "출판사명3", "isbn-3"));
			conn.commit(); 
			// SelectAll
			List<BookDto> allBook = selectAll();
			System.out.println("selectAll : ");
			allBook.forEach(el -> System.out.println(el));
//			//Select
			BookDto dto = select(1L);
			System.out.println("select : " +dto);
			//Update
			dto.setBookName("수정도서명-2");
			dto.setPublisher("수정출판사명-2");
			int r1 = updateBook(dto);
			if(r1>0)
				System.out.println("수정완료 :" + r1);
			//Delete
			int r2 = deleteBook(2L);
			if(r2<0)
				System.out.println("삭제완료 : " +r2);
			
			// Tx End
		} catch (Exception e) {
			// Tx RollbackAll
		}

	}
}
