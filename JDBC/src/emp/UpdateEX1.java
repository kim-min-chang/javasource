package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateEX1 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "TIGER";

            // 3. connection
            con = DriverManager.getConnection(url, user, password);
            // 자바에서 autocommit 임
            con.setAutoCommit(false);

            // 4.update 작업
            String sql = "UPDATE emp_temp SET COMM = WHERE EMPNO = 7369";
            pstmt = con.prepareStatement(sql);
            int result = pstmt.executeUpdate();

            if (result > 0) {
                System.out.println("성공");
                con.commit();
            } else {
                con.rollback();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
