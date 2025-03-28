package Domain;

import java.sql.SQLException;
import java.util.List;



public interface BookDAO {
	
	int insert(BookDTO bookDTO) throws Exception;

	int update(BookDTO bookDTO) throws Exception;

	int delete(BookDTO bookDTO) throws SQLException;
	//단건조회

	BookDTO select(BookDTO bookDTO);
	//다건조회

	List<BookDTO> selectAll();

}
