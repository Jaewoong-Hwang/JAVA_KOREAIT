package Ch38.Controller;

import java.util.HashMap;

import java.util.Map;

import Ch38.Domain.Dto.BookDto;

public class BookController implements SubController{
	Map<String,Object> response;

	@Override
	public Map<String, Object> execute(Map<String, Object> params) {
		// TODO Auto-generated method stub
		System.out.println("[SC] BookController execute invoke..!");
		//00
		response = new HashMap();
		Integer serviceNo = (Integer)params.get("serviceNo");
		if(serviceNo==null) {
			response.put("status", false);
			response.put("message", "유효하지 않은 서비스 요청입니다.");
			return response;
		}
		switch(serviceNo) {
		case 1:			//C - 도서등록(ROLeE-사서)
			System.out.println("[SC] 도서 등록 요청 확인");
			//01파라미터받기
			 String bookCode = (params.get("bookCode")!=null)?(String)params.get("bookCode"):null;
			 String bookName = (params.get("bookName")!=null)?(String)params.get("bookName"):null;
			 String publisher = (params.get("publisher")!=null)?(String)params.get("publisher"):null;
			 String isbn = (params.get("isbn")!=null)?(String)params.get("isbn"):null;
			 BookDto bookDto = new BookDto(bookCode, bookName, publisher, isbn);
			//02 유효성검증(Data Validation)
			 boolean isOk = isValid(bookDto);
			 System.out.println("[No-1 도서등록] : 유요성 검증 확인 : 0" + isOk);
				if (isOk) {
					response.put("status", false);
					response.put("message", "유효성 체크 오류발생!");
					return response;
				}
			//03 관련 서비스 실행
			//04 뷰로 이동(or 내용전달)
			break;
		case 2:			//R - 도서 조회(ROLE-회원,사서,관리자)
			System.out.println("[SC] 도서 조회 요청 확인");
			//01파라미터받기
			//02 유효성검증(Data Validation)
			//03 관련 서비스 실행
			//04 뷰로 이동(or 내용전달)
			break;
		case 3:			//U - 도서 수정(ROLE-사서,관리자)
			System.out.println("[SC] 도서 수정 요청 확인");
			//01파라미터받기
			//02 유효성검증(Data Validation)
			//03 관련 서비스 실행
			//04 뷰로 이동(or 내용전달)
			break;
		case 4:			//D - 도서 삭제(ROLE-사서,관리자)
			System.out.println("[SC] 도서삭제 요청 확인");
			//01파라미터받기
			//02 유효성검증(Data Validation)
			//03 관련 서비스 실행
			//04 뷰로 이동(or 내용전달)
			break;
		
		default:
			System.out.println("[SC] 잘못된 서비스번호 요청 확인");
			response.put("status", false);
			response.put("message", "잘못된 서비스번호 요청입니다.");
		}
		
		return response;
	}
	
	private boolean isValid(BookDto bookDto) {
		if (bookDto.getBookCode() == null || bookDto.getBookCode().length() !=8) {
			response.put("error", "BookCode의 길이는 최소 8자야 합니다.");
			System.out.println("[INVALID] BookCod의 길이는 최소 8자야 합니다.");
			return false;
		}
		if (bookDto.getBookCode() == null || bookDto.getBookCode().length() >255) {
			response.put("error", "BookCode의 길이는 255자를 넘기면 안됩니다.");
			System.out.println("[INVALID] BookCod의 길이는 255자를 넘기면 안됩니다.");
			return false;
		}
//		if(bookDto.getBookCode().matches("^[0-9].*")) {
//			System.out.println("[INVALID] BookCod의 첫 문자로 숫가자 들어올 수 없습니다.");
//			response.put("error", "BookCode의 첫 문자로 숫자가 들어올 수 없습니다.");
//			return false;
//		}	
		
		
		return true;
	}

}
