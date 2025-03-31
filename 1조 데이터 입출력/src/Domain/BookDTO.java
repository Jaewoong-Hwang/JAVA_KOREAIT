package Domain;

public class BookDTO {

    private int bookCode;                // 도서코드 (PK)
    private int classificationId;       // 분류번호 (FK)
    private String bookAuthor;          // 저자
    private String bookName;            // 책제목
    private String publisher;           // 출판사
    private int isReserve;              // 예약여부 (0: 아니오, 1: 예약)

    public BookDTO() {}

    public BookDTO(int bookCode, int classificationId, String bookAuthor,
                   String bookName, String publisher, int isReserve) {
        this.bookCode = bookCode;
        this.classificationId = classificationId;
        this.bookAuthor = bookAuthor;
        this.bookName = bookName;
        this.publisher = publisher;
        this.isReserve = isReserve;
    }

    // Getters and Setters
    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public int getClassificationId() {
        return classificationId;
    }

    public void setClassificationId(int classificationId) {
        this.classificationId = classificationId;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getIsReserve() {
        return isReserve;
    }

    public void setIsReserve(int isReserve) {
        this.isReserve = isReserve;
    }

    @Override
    public String toString() {
        return "BookDTO [bookCode=" + bookCode +
               ", classificationId=" + classificationId +
               ", bookAuthor=" + bookAuthor +
               ", bookName=" + bookName +
               ", publisher=" + publisher +
               ", isReserve=" + isReserve + "]";
    }
}
