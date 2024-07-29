package ex08.practice;

import java.util.ArrayList;
import java.util.List;

import ex07.practice.Book;

public class ListEx {
    public static void main(String[] args) {
        // 리스트를 선언하는 방법
        // 타입을 지정하지 않은 경우
        // opject 타입
        
        ArrayList list = new ArrayList<>();
        list.add("안녕"); // String
        list.add(1234); // Integer
        list.add(true); // Boolean
        list.add(new Book(0, "제목", "작가"));

        // 자식타입으로 변환되기 위해서 확인이 필요함
        System.out.println(list.get(0));

        for(Object obj : list){
            System.out.println(obj);
        }
        // 타입을 지정한 경우 - 지정한 타입만 저장가능
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book(0, "제목", "작가"));

        System.out.println(list);
        System.out.println(bookList);
        System.out.println("========================");
        // 향상된 for문
        for(Book book : bookList){
            System.out.println(book);
        }
    }
}
