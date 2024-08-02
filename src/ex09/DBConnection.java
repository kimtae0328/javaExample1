package ex09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DBConnection {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // url, id, pw
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:orcl", "user01", "1234");

            String sql = "select * from tb_book";
            // 쿼리를 질의할수 있는객체
            // 쿼리 세팅
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            List<Book> list = new ArrayList<Book>();

            while (rs.next()) {
                String b_no = rs.getString("b_no");
                String title = rs.getString("title");
                String author = rs.getString("author");
                String rentyn = rs.getString("rentyn");

                Book book = new Book(b_no, title, author, rentyn);
                list.add(book);
            }

            // System.out.println(list);
            for(Book book : list){
                System.out.println(book);
            }

            // 자원해제
            rs.close();
            pstmt.close();
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("라이브러리가 추가되었는지 확인해주세요.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("DB접속정보를 확인해주세요.");
            e.printStackTrace();
        }
    }

}