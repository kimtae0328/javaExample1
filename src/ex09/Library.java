package ex09;

import java.util.List;

public class Library {
    List<Book> list;
    BookDao dao = new BookDao();

    Library(){

        // DB에 접근해서 도서목록조회
        list = dao.getBooklist();
        for(Book book : list){
            System.out.println(book);
        }
    }
}
