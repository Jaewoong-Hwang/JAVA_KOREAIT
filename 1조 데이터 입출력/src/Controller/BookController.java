package Controller;

import java.util.HashMap;
import java.util.Map;


import Domain.BookDTO;
import Service.BookService;

public class BookController implements SUBController {

    private BookService bookService;
    Map<String, Object> response;

    public BookController() {
        try {
            bookService = BookService.getInstance();
        } catch (Exception e) {
            exceptionHandler(e);
        }
    }

    @Override
    public Map<String, Object> execute(Map<String, Object> params) throws Exception {
        System.out.println("[SC] BookController execute invoked...");
        response = new HashMap<>();

        Integer serviceNo = (Integer) params.get("serviceNo");
        if (serviceNo == null) {
            response.put("status", false);
            response.put("message", "유효하지 않은 서비스 요청입니다.");
            return response;
        }

        switch (serviceNo) {

            case 1: // 도서 등록
                int bookCode = (int) params.get("bookCode");
                int classificationId = (int) params.get("classificationId");
                String bookAuthor = (String) params.get("bookAuthor");
                String bookName = (String) params.get("bookName");
                String publisher = (String) params.get("publisher");
                int isReserve = (int) params.get("isReserve");

                BookDTO newBook = new BookDTO(bookCode, classificationId, bookAuthor, bookName, publisher, isReserve);
                if (!isValid(newBook)) {
                    response.put("status", false);
                    return response;
                }
                boolean isInserted = bookService.bookJoin(newBook);
                response.put("status", isInserted);
                response.put("message", isInserted ? "도서 등록 성공!" : "도서 등록 실패!");
                break;

            case 2: // 전체 조회
                response.put("status", true);
                response.put("books", bookService.getAllBooks());
                break;

            case 3: // 도서 수정
                int ubCode = (int) params.get("bookCode");
                int uClassId = (int) params.get("classificationId");
                String uAuthor = (String) params.get("bookAuthor");
                String uName = (String) params.get("bookName");
                String uPublisher = (String) params.get("publisher");
                int uIsReserve = (int) params.get("isReserve");

                BookDTO updateBook = new BookDTO(ubCode, uClassId, uAuthor, uName, uPublisher, uIsReserve);
                if (!isValid(updateBook)) {
                    response.put("status", false);
                    return response;
                }
                boolean isUpdated = bookService.updateBook(updateBook);
                response.put("status", isUpdated);
                response.put("message", isUpdated ? "도서 수정 성공!" : "도서 수정 실패!");
                break;

            case 4: // 도서 삭제
                int delCode = (int) params.get("bookCode");
                boolean isDeleted = bookService.deleteBook(delCode);
                response.put("status", isDeleted);
                response.put("message", isDeleted ? "도서 삭제 성공!" : "도서 삭제 실패!");
                break;

            case 5: // 단건 조회
                int selectCode = (int) params.get("bookCode");
                BookDTO result = bookService.getBook(selectCode);
                if (result != null) {
                    response.put("status", true);
                    response.put("book", result);
                } else {
                    response.put("status", false);
                    response.put("message", "해당 도서가 존재하지 않습니다.");
                }
                break;

            default:
                response.put("status", false);
                response.put("message", "알 수 없는 서비스 번호입니다.");
        }

        return response;
    }
    private boolean isValid(BookDTO bookDto) {
        // bookCode: 8자리 숫자 문자열만 허용
        if (String.valueOf(bookDto.getBookCode()).length() != 8) {
            response.put("error", "bookCode는 8자리 숫자여야 합니다.");
            return false;
        }

        // classificationId: 양의 정수만 허용
        if (bookDto.getClassificationId() <= 0) {
            response.put("error", "classificationId는 0보다 커야 합니다.");
            return false;
        }

        // bookAuthor: 비어 있으면 안됨
        if (bookDto.getBookAuthor() == null || bookDto.getBookAuthor().isBlank()) {
            response.put("error", "bookAuthor는 필수 입력입니다.");
            return false;
        }

        // bookName: null 허용 안함, 길이 제한
        if (bookDto.getBookName() == null || bookDto.getBookName().length() > 255) {
            response.put("error", "bookName은 null이 될 수 없고, 255자 이내여야 합니다.");
            return false;
        }

        // publisher: 비어 있으면 안됨
        if (bookDto.getPublisher() == null || bookDto.getPublisher().isBlank()) {
            response.put("error", "publisher는 필수 입력입니다.");
            return false;
        }

        // isReserve: 0 또는 1만 허용
        if (bookDto.getIsReserve() != 0 && bookDto.getIsReserve() != 1) {
            response.put("error", "isReserve는 0 또는 1만 허용됩니다.");
            return false;
        }

        return true; // 모두 통과
    }

    
    
    private Map<String, Object> exceptionHandler(Exception e) {
        if (response == null) response = new HashMap<>();
        response.put("status", false);
        response.put("message", e.getMessage());
        response.put("exception", e);
        return response;
    }
}
