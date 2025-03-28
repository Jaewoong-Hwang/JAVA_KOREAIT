package Domain;

import org.junit.jupiter.api.Test;

public class DAOTest {
	@Test
	void test() throws Exception{
		BookDAO bookDAOImpl = BookDAOImpl.getInstance();
		int result = bookDAOImpl.insert(new BookDTO("1123","리눅스다","한빛미디어","111-111"));
		 
	        if (result > 0) {
	            System.out.println("도서 등록 성공!");
	        } else {
	            System.out.println("도서 등록 실패!");
	        }
	}
}
