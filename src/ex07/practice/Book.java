package ex07.practice;

import lombok.Data;

@Data
public class Book {
    private int no;         // 도서번호
    private String title;   // 도서명
    private String author;  // 작가명
    private boolean rent;   // 대여여부

    public Book(int no, String title, String author, boolean rent){
        this.no = no;
        this.title = title;
        this.author = author;
        // 도서관이 생성되면서 새로만든 책은 대여가 가능한 상태
        this.rent = rent;
    }

    public Book(int i, String string, String string2) {

    }
}
