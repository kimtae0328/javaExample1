package ex09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * 데이터베이스 커넥션을 생성 후 반환함
 */
public class ConnectionUtil {
    public static Connection getConnection() {
        Connection con = null;
        // 오라클 드라이버 로딩
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // 데이터베이스 연결 생성
            // url, id, pw
            try {
                con = DriverManager.getConnection(
                        "jdbc:oracle:thin:@localhost:1521:orcl", "user01", "1234");
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return con;
    }

    public static void closeConnection(ResultSet rs, PreparedStatement pstmt, Connection con){
        try {
            if(rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (con != null) con.close();
        
        } catch (SQLException e) {
            System.out.println("closeConnection 처리중 예외 발생");
            e.printStackTrace();
        }
    }
}
