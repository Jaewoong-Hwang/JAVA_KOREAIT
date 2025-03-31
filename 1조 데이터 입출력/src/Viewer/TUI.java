package Viewer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Controller.FrontController;
import Domain.BookDTO;

public class TUI {

	private Scanner sc = new Scanner(System.in);
	private FrontController controller;

	public TUI() throws Exception {
		controller = FrontController.getInstance();
	}

	public void MainMenu() {
		System.out.println("Driver Loading Success");
		System.out.println("DB Connected..");

		while (true) {
			System.out.println("------------ M E N U ------------");
			System.out.println("1 Book_Tbl");
			System.out.println("2 Member_Tbl");
			System.out.println("3 Rental_Tbl");
			System.out.println("4 Exit");
			System.out.print("번호: ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				BookMenu();
				break;
			case 2:
				System.out.println("--------------------------------");
				System.out.println("Member_Tbl 은 아직 구현되지 않았습니다.");
				break;
			case 3:
				System.out.println("--------------------------------");
				System.out.println("Rental_Tbl 은 아직 구현되지 않았습니다.");
				break;
			case 4:
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("올바른 번호를 입력해주세요.");
			}
		}
	}

	public void BookMenu() {
		while (true) {
			System.out.println("------------ B O O K ------------");
			System.out.println("1 Insert");
			System.out.println("2 Update");
			System.out.println("3 Select All");
			System.out.println("4 Delete");
			System.out.println("5 Select One");
			System.out.println("6 Prev");
			System.out.print("번호: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				handleBookInsert();
				break;
			case 2:
				handleBookUpdate();
				break;
			case 3:
				handleBookSelectAll();
				break;
			case 4:
				handleBookDelete();
				break;
			case 5:
				handleBookSelectOne();
				break;
			case 6:
				return;
			default:
				System.out.println("올바른 번호를 입력해주세요.");
			}
		}
	}

	private void handleBookInsert() {
		System.out.println("등록 가능한 분류번호:");
		System.out.println("--------------------------------");
		System.out.println("[100] 문학 \n[101] 에세이\n[102] 컴퓨터");
		System.out.println("--------------------------------");
		System.out.println("도서코드 | 분류번호 | 저자 | 책제목 | 출판사 | 예약여부 입력:");
		int bookCode = sc.nextInt();
		int classificationId = sc.nextInt();
		String author = sc.next();
		String name = sc.next();
		String publisher = sc.next();
		int isReserve = sc.nextInt();

		Map<String, Object> params = new HashMap<>();
		params.put("endPoint", "/book");
		params.put("serviceNo", 1);
		params.put("bookCode", bookCode);
		params.put("classificationId", classificationId);
		params.put("bookAuthor", author);
		params.put("bookName", name);
		params.put("publisher", publisher);
		params.put("isReserve", isReserve);

		try {
			Map<String, Object> response = controller.execute(params);
			System.out.println("▶ " + response.get("message"));
		} catch (Exception e) {
			System.out.println("도서 등록 중 오류 발생: " + e.getMessage());
		}
	}

	private void handleBookUpdate() {
		System.out.println("수정할 도서 정보 입력 (도서코드 분류번호 저자 제목 출판사 예약여부):");
		int bookCode = sc.nextInt();
		int classificationId = sc.nextInt();
		String author = sc.next();
		String name = sc.next();
		String publisher = sc.next();
		int isReserve = sc.nextInt();

		Map<String, Object> params = new HashMap<>();
		params.put("endPoint", "/book");
		params.put("serviceNo", 3);
		params.put("bookCode", bookCode);
		params.put("classificationId", classificationId);
		params.put("bookAuthor", author);
		params.put("bookName", name);
		params.put("publisher", publisher);
		params.put("isReserve", isReserve);

		try {
			Map<String, Object> response = controller.execute(params);
			System.out.println("▶ " + response.get("message"));
		} catch (Exception e) {
			System.out.println("도서 수정 중 오류 발생: " + e.getMessage());
		}
	}

	private void handleBookDelete() {
		System.out.print("삭제할 도서코드 입력: ");
		int bookCode = sc.nextInt();

		Map<String, Object> params = new HashMap<>();
		params.put("endPoint", "/book");
		params.put("serviceNo", 4);
		params.put("bookCode", bookCode);

		try {
			Map<String, Object> response = controller.execute(params);
			System.out.println("▶ " + response.get("message"));
		} catch (Exception e) {
			System.out.println("도서 삭제 중 오류 발생: " + e.getMessage());
		}
	}

	private void handleBookSelectAll() {
		Map<String, Object> params = new HashMap<>();
		params.put("endPoint", "/book");
		params.put("serviceNo", 2);

		try {
	        Map<String, Object> response = controller.execute(params);

	        if (!(boolean) response.get("status")) {
	            System.out.println("❌ 조회 실패: " + response.get("message"));
	            return;
	        }

	        List<BookDTO> books = (List<BookDTO>) response.get("books");

	        if (books == null || books.isEmpty()) {
	            System.out.println("조회된 도서가 없습니다.");
	            return;
	        }

	        System.out.println("전체 도서 목록:");
	        for (BookDTO book : books) {
	            System.out.printf("코드: %d | 분류: %d | 저자: %s | 제목: %s | 출판사: %s | 예약: %d\n",
	                    book.getBookCode(), book.getClassificationId(), book.getBookAuthor(),
	                    book.getBookName(), book.getPublisher(), book.getIsReserve());
	        }

		} catch (Exception e) {
			System.out.println("도서 전체조회 오류: " + e.getMessage());
		}
	}

	private void handleBookSelectOne() {
		System.out.print("조회할 도서코드 입력: ");
		int bookCode = sc.nextInt();

		Map<String, Object> params = new HashMap<>();
		params.put("endPoint", "/book");
		params.put("serviceNo", 5);
		params.put("bookCode", bookCode);

		try {
			Map<String, Object> response = controller.execute(params);

			if ((boolean) response.get("status")) {
				BookDTO book = (BookDTO) response.get("book");
				System.out.printf("▶ 코드: %d | 분류: %d | 저자: %s | 제목: %s | 출판사: %s | 예약: %d\n", book.getBookCode(),
						book.getClassificationId(), book.getBookAuthor(), book.getBookName(), book.getPublisher(),
						book.getIsReserve());
			} else {
				System.out.println("▶ " + response.get("message"));
			}
		} catch (Exception e) {
			System.out.println("도서 단건조회 오류: " + e.getMessage());
		}
	}
}
