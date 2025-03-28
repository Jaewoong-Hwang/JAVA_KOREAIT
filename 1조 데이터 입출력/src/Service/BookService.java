package Service;

import Domain.BookDAO;
import Domain.BookDAOImpl;

public class BookService {
	private BookDAO bookDAO;
	
	//싱글톤 패턴
	private static BookService instance;
	
	private BookService() throws Exception {
		bookDAO = BookDAOImpl.getInstance();
	}
	
	public static BookService getInstance() throws Exception	{
		if(instance == null)
			instance = new BookService();
		return instance;
	}
	
}
