package Ch38.Controller;

import java.util.Map;

public class UserController implements SubController{
		
		
		public Map<String,Object> execute(Map<String,Object> params){
			System.out.println("[SC] UserController execute invoke..!");
			
			
			//01파라미터받기
			//02 유효성검증(Data Validation)
			//03 관련 서비스 실행
			//04 뷰로 이동(or 내용전달)
			return null;
		}

		
}
