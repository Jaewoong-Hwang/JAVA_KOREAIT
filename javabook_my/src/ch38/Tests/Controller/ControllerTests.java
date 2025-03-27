package Ch38.Tests.Controller;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import Ch38.Controller.FrontController;

class ControllerTests {

	FrontController fc = FrontController.getInstance();

	@Test
	@Disabled
	void test1() {
		Map<String, Object> params = new HashMap();
		params.put("endPoint", "/user"); // endPoint
		params.put("serviceNo", 1); // ServiceNO

		// 회원가입-인자전달
		params.put("userid", "user");
		params.put("username", "홍길동");
		params.put("password", "1234");

		// 요청하기
		Map<String, Object> response = fc.execute(params);

		// 응답확인
		for (String key : response.keySet()) {
			System.out.println(key + " : " + response.get(key));

		}
	}

	@Test
//	@Disabled
	void test2() {
		Map<String, Object> params = new HashMap();
		params.put("endPoint", "/book"); // endPoint
		params.put("serviceNo", 1); // ServiceNO

		// 도서등록-인자전달
		params.put("bookCode", "11111111");
		params.put("bookName", "aaaaaaaa");
		params.put("publisher", "bbbbbbbb");
		params.put("isbn", "22222222");

		// 요청하기
		Map<String, Object> response = fc.execute(params);

		// 응답확인
		for (String key : response.keySet()) {
			System.out.println(key + " : " + response.get(key));

		}
	}
}
