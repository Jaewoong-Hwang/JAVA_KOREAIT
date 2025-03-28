package Ch38.Tests.Service;

import java.sql.SQLException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import Ch38.Domain.Dto.BookDto;
import Ch38.Domain.Dto.UserDto;
import Ch38.Domain.Service.BookServiceImpl;
import Ch38.Domain.Service.UserServiceImpl;

class ServiceTests {

	@Test
	@Disabled
	void test() throws ClassNotFoundException, SQLException {

		UserServiceImpl userService = UserServiceImpl.getInstance();

		userService.userJoin(new UserDto("bbb", "남길동", "1234", "ROLE_USER"));
	}

	@Test

	void test_2() throws Exception {
		BookServiceImpl bookService = BookServiceImpl.getInstance();
		bookService.bookRegistration(new BookDto("1010101","C언어 기본", "코리아미디어", "1010-1010"));

	}

	@Test
	@Disabled
	void test_99() {

	}
}
