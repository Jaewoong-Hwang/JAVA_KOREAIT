package Service;

import java.util.List;

import Domain.BookDAO;
import Domain.BookDAOImpl;
import Domain.BookDTO;

public class BookService {
	private BookDAO bookDAO;

	// 싱글톤 패턴
	private static BookService instance;

	private BookService() throws Exception {
		bookDAO = BookDAOImpl.getInstance();
	}

	public static BookService getInstance() throws Exception {
		if (instance == null)
			instance = new BookService();
		return instance;
	}

	// 회원가입(+TX처리필요)
	public boolean bookJoin(BookDTO bookDTO) throws Exception {
		boolean isJoin = false;
		try {

			isJoin = bookDAO.insert(bookDTO) > 0; // sql 질의 다수
//				userDao.insert(new UserDto("aaaa","","","")); 
//				userDao.insert(new UserDto("aaab","","","")); 
//				userDao.insert(new UserDto("aaaa","","","")); //pk 중복 오류

		} catch (Exception e) {
			// rollback
//				connectionPool.rollbackTransaction();
		}

		return isJoin;

	};
	public List<BookDTO> getAllBooks() {
	    return bookDAO.selectAll();
	}


}
