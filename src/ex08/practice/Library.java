package ex08.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ex07.common.ScannerUtil;

public class Library {
    // 타입을 미리 지정 함으로써
    // 꺼낼때 형변환을 할필요가 없다.
    List<Book> bookList = new ArrayList<Book>();
    private Book book;

    public Library() {
        bookList.add(new Book(1, "제목1", "작가1"));
        bookList.add(book);
        bookList.add(new Book(2, "제목2", "작가2"));
        bookList.add(new Book(3, "제목3", "작가3"));
        bookList.add(new Book(4, "제목4", "작가4"));
        bookList.add(new Book(5, "제목5", "작가5"));
    }

    public void menu() {
        while (true) {
            System.out.println("1. 도서대여");
            System.out.println("2. 도서반납");
            System.out.println("3. 도서등록");
            System.out.println("4. 도서삭제");
            System.out.println("9. 종료");

            int menu = ScannerUtil.getInt("메뉴입력");
            if (menu == 1) {
                System.out.println("도서대여");
                int bookNo = ScannerUtil.getInt("도서번호");
                // index범위를 벗어나는 값을 입력했다면
                if (bookNo > bookList.size()) {
                    System.out.println("도서번호를 확인 후 다시 시도해 주세요.");
                    // 더이상 코드블럭을 실행하지 않고 다음 반복문으로 넘어감
                    continue;
                }
                Book book = bookList.get(bookNo);

                if (book != null) {
                    if (book.isRent()) {
                        System.out.println("이미 대여중입니다.");
                    } else {
                        book.setRent(true);
                        System.out.println("대여되었습니다.");
                    }

                } else {
                    System.out.println(bookNo + " 는 없는 번호 입니다.");
                }

            } else if (menu == 2) {

                int bookNo = ScannerUtil.getInt("도서번호를 입력해주세요");

                if (bookNo >= bookList.size()) {
                    continue;
                }
                Book book = bookList.get(bookNo);
                if (book != null) {
                    if (book.isRent()) {
                        book.setRent(false);
                        System.out.println("반납되었습니다.");
                    } else {
                        System.out.println("반납 가능한 상태가 아닙니다.");
                    }
                } else {
                    System.out.println(bookNo + "도서가 존재하지 않습니다.");
                }

            } else if (menu == 3) {
                System.out.println("도서등록");
                int no = ScannerUtil.getInt("도서번호 : ");
                String title = ScannerUtil.getString("도서명 : ");
                String author = ScannerUtil.getString("작가 : ");
                new Book(no, title, author);
                boolean res = bookList.add(book);
                if(res){
                    System.out.println("등록되었습니다.");
                } else{
                    System.out.println("등록에 실패하였습니다.");
                }

            } else if (menu == 4) {
                int bookNo = ScannerUtil.getInt("도서번호를 입력해주세요.");
                Book book = bookList.remove(bookNo);
                System.out.println(book.getTitle() + "삭제되었습니다.");

            } else if (menu == 9) {
                System.out.println("프로그램을 종료합니다.");
                System.exit(-1);
            } else {
                System.out.println("메뉴를 확인후 다시 입력해 주세요");
            }
        }
    }

    @Override
    public String toString() {
        String str = "";
        int i = 0;
        for (Book book : bookList) {
            str += "[" + i + "]" + book;
            i++;
        }
        return str;
    }

}