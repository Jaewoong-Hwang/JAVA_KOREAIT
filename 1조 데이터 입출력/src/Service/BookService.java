package Service;

import java.util.List;

import Domain.BookDAO;
import Domain.BookDAOImpl;
import Domain.BookDTO;

public class BookService {

    private BookDAO bookDAO;

    private static BookService instance;

    private BookService() throws Exception {
        bookDAO = BookDAOImpl.getInstance();
    }

    public static BookService getInstance() throws Exception {
        if (instance == null)
            instance = new BookService();
        return instance;
    }

    // 도서 등록
    public boolean bookJoin(BookDTO bookDTO) throws Exception {
        return bookDAO.insert(bookDTO) > 0;
    }

    // 전체 조회
    public List<BookDTO> getAllBooks() {
        return bookDAO.selectAll();
    }

    // 단건 조회
    public BookDTO getBook(int bookCode) {
        BookDTO dto = new BookDTO();
        dto.setBookCode(bookCode);
        return bookDAO.select(dto);
    }

    // 도서 수정
    public boolean updateBook(BookDTO bookDTO) throws Exception {
        return bookDAO.update(bookDTO) > 0;
    }

    // 도서 삭제
    public boolean deleteBook(int bookCode) throws Exception {
        BookDTO dto = new BookDTO();
        dto.setBookCode(bookCode);
        return bookDAO.delete(dto) > 0;
    }
}
