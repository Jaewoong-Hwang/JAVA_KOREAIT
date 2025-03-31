package Domain;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDAOImpl implements BookDAO {

    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private final String USER = "system";
    private final String PASSWORD = "1234";

    private static BookDAO instance;

    private BookDAOImpl() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        conn = DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static BookDAO getInstance() throws Exception {
        if (instance == null)
            instance = new BookDAOImpl();
        return instance;
    }

    @Override
    public int insert(BookDTO dto) throws Exception {
        String sql = "INSERT INTO tbl_book (book_code, classification_id, book_author, book_name, publisher, isreserve) " +
                     "VALUES (?, ?, ?, ?, ?, ?)";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, dto.getBookCode());
            pstmt.setInt(2, dto.getClassificationId());
            pstmt.setString(3, dto.getBookAuthor());
            pstmt.setString(4, dto.getBookName());
            pstmt.setString(5, dto.getPublisher());
            pstmt.setInt(6, dto.getIsReserve());

            return pstmt.executeUpdate();
        } finally {
            close();
        }
    }

    @Override
    public int update(BookDTO dto) throws Exception {
        String sql = "UPDATE tbl_book SET classification_id = ?, book_author = ?, book_name = ?, publisher = ?, isreserve = ? WHERE book_code = ?" +
                     "WHERE book_code = ?";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, dto.getClassificationId());
            pstmt.setString(2, dto.getBookAuthor());
            pstmt.setString(3, dto.getBookName());
            pstmt.setString(4, dto.getPublisher());
            pstmt.setInt(5, dto.getIsReserve());
            pstmt.setInt(6, dto.getBookCode());

            return pstmt.executeUpdate();
        } finally {
            close();
        }
    }

    @Override
    public int delete(BookDTO dto) throws SQLException {
        String sql = "DELETE FROM tbl_book WHERE book_code = ?";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, dto.getBookCode());

            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("BOOKDAO's DELETE SQL EXCEPTION!!");
        } finally {
            close();
        }
    }

    @Override
    public BookDTO select(BookDTO dto) {
        String sql = "SELECT * FROM tbl_book WHERE book_code = ?";
        BookDTO result = null;

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, dto.getBookCode());
            rs = pstmt.executeQuery();

            if (rs.next()) {
                result = new BookDTO(
                    rs.getInt("book_code"),
                    rs.getInt("classification_id"),
                    rs.getString("book_author"),
                    rs.getString("book_name"),
                    rs.getString("publisher"),
                    rs.getInt("isreserve")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }

        return result;
    }

    @Override
    public List<BookDTO> selectAll() {
        List<BookDTO> list = new ArrayList<>();
        String sql = "SELECT * FROM tbl_book";

        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                BookDTO dto = new BookDTO(
                    rs.getInt("book_code"),
                    rs.getInt("classification_id"),
                    rs.getString("book_author"),
                    rs.getString("book_name"),
                    rs.getString("publisher"),
                    rs.getInt("isreserve")
                );
                list.add(dto);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }

        return list;
    }

    private void close() {
        try { if (rs != null) rs.close(); } catch (Exception e) {}
        try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
    }
}
