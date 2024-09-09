package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteEx1 {
    public static void main(String[] args) throws SQLException {

        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            // 1. 오라클 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // 2. url,user id,password
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "TIGER";
            // 3. connection
            try {
                con = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            // 4. delete 작업
            // 4-1. delete sql 구문 작성
            String sql = "delete from emp_temp where empno = 7201";

            // 4-2. sql 구문 전송
            pstmt = con.prepareStatement(sql);

            // 4-3. sql 구문 실행 후 결과 받기
            int result = pstmt.executeUpdate();
            if (result > 0) {
                System.out.println("삭제성공");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
